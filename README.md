# Quiz Microservices Backend

A microservices-based Quiz Application built with Spring Boot, featuring an API Gateway and Eureka service discovery. It supports quiz creation, dynamic question retrieval, and score calculation via REST APIs and inter-service communication.

## Architecture

The system is split into independent services:

- **Eureka Server** – Service registry where all services register.
- **API Gateway** – Single entry point; routes requests to Quiz and Question services.
- **Quiz Service** – Handles quiz creation, quiz metadata, and delegates to Question Service for questions and scoring.
- **Question Service** – Manages the question bank, random question selection, and score calculation.

Services communicate synchronously over HTTP using **OpenFeign**.

## Tech Stack

- **Language:** Java 17  
- **Framework:** Spring Boot  
- **Microservices:** Spring Cloud (Eureka Server/Client, OpenFeign)  
- **Gateway:** Spring Cloud Gateway (Reactive)  
- **Persistence:** Spring Data JPA, MySQL  
- **Build & Tools:** Maven, Postman, Git  

## Core Features

- Create a quiz by category and title.  
- Fetch quiz questions by quiz ID.  
- Submit quiz answers and get a computed score.  
- Service discovery and routing via Eureka + API Gateway.  
- Clear separation of responsibilities between Quiz and Question services.  

## Learning Highlights

- Designed microservice boundaries for quiz and question domains.  
- Implemented service discovery and routing with Eureka and API Gateway.  
- Practiced resilient REST API design and inter-service communication using OpenFeign.  
