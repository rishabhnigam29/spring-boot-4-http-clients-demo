# Spring Boot HTTP Clients — Spring Boot 3 vs Spring Boot 4

This repository demonstrates different approaches to calling external HTTP APIs in Spring Boot, with a clear comparison between the traditional Spring Boot 3 style and the modern Spring Boot 4 HTTP client model.

The goal of this project is to highlight how Spring Boot 4 simplifies HTTP client configuration by reducing boilerplate and focusing on interface-based HTTP services.

---

## What This Project Shows

- Calling external REST APIs using Spring Boot
- Traditional HTTP client configuration used in Spring Boot 3
- Modern interface-based HTTP clients introduced in Spring Boot 4
- Side-by-side comparison using the same APIs and behavior

The examples use real public APIs:
- GitHub Milestones API  
- GitHub Issues API  
- Stack Overflow Questions API  

No authentication is required for these endpoints.

---

## Project Structure

The project contains two alternative HTTP client configurations:

- **TraditionalHttpServiceConfig**  
  Represents the Spring Boot 3 style approach where `RestClient`, proxy factories, and adapters are configured manually.

- **ModernHttpServiceConfig**  
  Represents the Spring Boot 4 approach where Spring automatically generates HTTP client implementations from interfaces.

> Only **one configuration should be active at a time**.

---

## Switching Between Spring Boot 3 and Spring Boot 4 Styles

To use the **Spring Boot 3 (traditional) approach**:

- Uncomment `TraditionalHttpServiceConfig`
- Comment out `ModernHttpServiceConfig`

To use the **Spring Boot 4 (modern) approach**:

- Uncomment `ModernHttpServiceConfig`
- Comment out `TraditionalHttpServiceConfig`

No other code changes are required.

---

## Why This Matters

While the traditional approach works correctly, it requires repetitive infrastructure code for each external service.

The Spring Boot 4 model:
- Eliminates proxy factories and adapters
- Reduces configuration classes
- Improves readability and maintainability
- Keeps HTTP client definitions close to the service interface

This allows developers to focus more on business logic and less on infrastructure wiring.

---

## Requirements

- Java 17+ (or higher depending on the Spring Boot version)
- Maven or Gradle
- Internet access (to call public APIs)

---

## Who This Is For

This project is intended for:
- Developers upgrading from Spring Boot 3 to Spring Boot 4
- Developers working with external API integrations
- Developers interested in modern Spring HTTP client design

---

## Related Video

This repository accompanies a YouTube video that walks through the code and explains the differences between the two approaches.
