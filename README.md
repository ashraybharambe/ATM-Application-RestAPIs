# ATM-Application-RestAPIs

# Spring Boot, H2, JPA, Hibernate Rest API 

Build Restful CRUD API for an ATM application using Spring Boot, H2, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/ashraybharambe/ATM-Application-RestAPIs.git
```

**2. Build and run the app using maven**

```bash
mvn package
java -jar target/ATM-0.0.1-SNAPSHOT
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

**3. Using any IDE (STS, Eclipse, Intellij)
+ Import the project using maven 
+ Run as spring-boot app

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /users
    
    GET /users/{userId}
    
    POST /users
    
    PUT /users
    
    GET /users/{userId}/accounts
    
    GET /users/{userId}/accounts/{accountId}
    
    PUT users/{userId}/accounts/{accountId}/withdraw
    
    PUT users/{userId}/accounts/{accountId}/deposit
    
    POST /users/{userId}/accounts
    
    PUT /users/{userId}/accounts
    
    GET /users/{userId}/accounts/{accountId}/getBalance
    
    GET /users/{userId}/accounts/{accountId}/transactions
    
    GET /users/{userId}/accounts/{accountID}/transactions/{transactionId}
You can test them using postman or any other rest client.
