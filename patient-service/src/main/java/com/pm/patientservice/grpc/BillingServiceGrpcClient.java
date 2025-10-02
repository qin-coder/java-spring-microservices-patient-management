package com.pm.patientservice.grpc;

import billing.BillingInfoRequest;
import billing.BillingInfoResponse;
import billing.BillingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BillingServiceGrpcClient {
    private final BillingServiceGrpc.BillingServiceBlockingStub blockingStub;

    //localhost:9001/BillingService/
    public BillingServiceGrpcClient(@Value("${billing.service" +
                                            ".address:localhost}") String serverAddress,
                                    @Value("${billing.service.grpc" +
                                            ".port:9001}") int serverPort) {
        log.info("Connecting to billing service at {}:{}",
                serverAddress, serverPort);
        ManagedChannel channel =
                ManagedChannelBuilder.forAddress(serverAddress,
                                serverPort)
                        .usePlaintext()
                        .build();
        blockingStub = BillingServiceGrpc.newBlockingStub(channel);

    }

    public BillingInfoResponse createBillingAccount(String patientId, String name, String email) {
        BillingInfoRequest request =
                BillingInfoRequest.newBuilder()
                        .setPatientId(patientId)
                        .setName(name)
                        .setEmail(email)
                        .build();
        BillingInfoResponse response =
                blockingStub.createBillingAccount(request);
        log.info("Received response from billing service via GRPC: " +
                "{}", response);
        return response;
    }

}
