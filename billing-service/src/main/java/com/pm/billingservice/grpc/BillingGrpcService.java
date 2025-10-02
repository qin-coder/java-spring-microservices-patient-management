package com.pm.billingservice.grpc;


import billing.BillingServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j
public class BillingGrpcService extends BillingServiceGrpc.BillingServiceImplBase {
    @Override
    public void createBillingAccount(billing.BillingInfoRequest billingRequest,
                                     StreamObserver<billing.BillingInfoResponse> responseObserver) {
        log.info("Received request: {}", billingRequest.toString());
        //basic logic - e.g save to db ,perform calculations etc
        billing.BillingInfoResponse response =
                billing.BillingInfoResponse.newBuilder()
                .setAccountId("12345")
                .setStatus("ACTIVE")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
