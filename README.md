# Spring Boot Web API with Consul Integration

This project is a Spring Boot web API application that demonstrates integration with HashiCorp Consul for service discovery and configuration management.

## Prerequisites

- Java 17 or higher
- Maven 3.6.x or higher
- Consul server (for local development, you can use Docker)

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── demo/
│   │               ├── AppApplication.java
│   │               ├── controller/
│   │               └── config/
│   └── resources/
│       └── application.yml
```

## Getting Started

### 1. Running Consul

For local development, you can run Consul using Docker:

```bash
docker-compose up
```

Access the Consul UI at: http://localhost:8500

### 2. Building the Project

```bash
mvn clean install
```

### 3. Running the Application

```bash
mvn spring-boot:run
```

The application will start and register itself with Consul automatically.

## Configuration

The application uses the following default configuration:

- Server Port: 8080
- Consul Host: localhost
- Consul Port: 8500
- Service Name: spring-boot-consul-demo

You can modify these settings in `application.yml`:

```yaml
spring:
  application:
    name: spring-boot-consul-demo
  cloud:
    consul:
      host: localhost
      port: 8500
      discovery:
        instanceId: ${spring.application.name}:${random.value}
```

## Features

- Service registration and discovery with Consul
- Health check monitoring
- Configuration management
- RESTful API endpoints

## API Endpoints

The following endpoints are available:

- `GET /api/health` - Health check endpoint
- `GET /api/info` - Service information

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request