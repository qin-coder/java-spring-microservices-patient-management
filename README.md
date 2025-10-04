# 🏥 Hospital Management System - Microservices Architecture

A distributed healthcare system built with **Spring Boot microservices architecture**, covering **REST API, gRPC, Kafka, Docker, API Gateway, Auth Service (JWT)** and other core enterprise-level concepts.  

This project was built step by step through a full tutorial, resulting in a system that includes **Patient Service, Billing Service, Analytics Service, Auth Service, and API Gateway**.  

![Microservices](https://img.shields.io/badge/Architecture-Microservices-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
![Kafka](https://img.shields.io/badge/Apache%20Kafka-Integrated-orange)

## 📋 Project Overview

This hospital management system showcases a complete microservices ecosystem with:
- **Patient Service** - Core patient management with CRUD operations
- **Billing Service** - Financial transactions via gRPC
- **Analytics Service** - Real-time data processing with Kafka
- **Auth Service** - JWT-based authentication & authorization
- **API Gateway** - Unified entry point with route management

## 🏗️ Architecture

<div align="center">
  <img src="pics/1.png" width="100%" />
</div>


## 🚀 Features

### Core Services
- **Patient Management** - Complete CRUD with validation and error handling
- **RESTful APIs** - Clean, documented endpoints with OpenAPI/Swagger
- **Data Persistence** - PostgreSQL with JPA/Hibernate
- **Request Validation** - Comprehensive input validation and error handling

### Communication Patterns
- **gRPC** - High-performance service-to-service communication
- **Kafka Messaging** - Event-driven architecture for real-time analytics
- **Synchronous & Asynchronous** - Mixed communication patterns

### Security & Gateway
- **JWT Authentication** - Secure token-based authentication
- **API Gateway** - Centralized routing and request management
- **Request Filtering** - Security validation at gateway level

### Infrastructure
- **Docker Containerization** - Each service independently containerized
- **Database Integration** - PostgreSQL with proper connection pooling
- **Service Discovery** - Dynamic service registration and discovery

## 🚀 Tech Stack

- **Backend Framework**: Spring Boot, Spring Web, Spring Security  
- **Microservices Communication**: REST API, gRPC  
- **Message Queue**: Apache Kafka  
- **Authentication & Authorization**: JWT (JSON Web Token)  
- **Gateway Layer**: Spring Cloud Gateway  
- **Databases**: H2 (in-memory) / PostgreSQL (Docker)  
- **Containerization**: Docker & Docker Compose  
- **Testing**: JUnit 5, Spring Boot Test, Integration Tests  
- **API Docs**: OpenAPI / Swagger  





