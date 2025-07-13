# Reactive-digital-onboarding

# 🚀 Reactive Digital Onboarding

This project is a **Reactive Microservice** built for digital onboarding in the banking domain. It allows new customers to register online and kick-start the KYC (Know Your Customer) process in real time using Kafka-based asynchronous messaging.

---

## Business Functionality

The application provides:
- **Customer registration** API
- Stores customer data in a **MongoDB** database
- Sets KYC status to `PENDING`
- Publishes customer data to a **Kafka topic** (`kyc-initiation-topic`) for downstream processing (e.g., by a `verification-service`)
- Designed for **non-blocking**, **high-throughput**, and **scalable** customer onboarding pipelines

---

## 🛠 Tech Stack

| Layer | Technology |
|-------|------------|
| **Language** | Java 17 |
| **Framework** | Spring Boot 2.7.18 |
| **Reactive Stack** | Spring WebFlux |
| **Database** | MongoDB (Reactive) |
| **Messaging** | Kafka using Reactor Kafka |
| **Dependency Management** | Maven |
| **API Docs** | SpringDoc OpenAPI (Swagger UI) |
| **Build & Run** | Docker, Spring Boot Maven Plugin |
| **Monitoring-ready** | Kafka-compatible, container-ready |

---

## 📦 Modules

### 1. `onboarding-service`
- REST endpoint: `POST /api/customers/register`
- Stores customer info in MongoDB
- Emits customer data to Kafka for async KYC processing

---

## 📂 Project Structure

