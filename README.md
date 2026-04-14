[![CI](https://github.com/Rediet404/SE4801-Lab-Rediet-ATE-5020-14/actions/workflows/ci.yml/badge.svg)](https://github.com/Rediet404/SE4801-Lab-Rediet-ATE-5020-14/actions/workflows/ci.yml)

# SE4801 Lab - Product Service

This repository contains a Spring Boot Product Service application.

## Project Location

- Main project: `product-service/`

## Tech Stack

- Java 21
- Spring Boot 4
- Maven Wrapper (`./mvnw`)
- JPA + H2
- JUnit 5 + MockMvc

## API Base Path

- `/api/v1/products`

## Common Commands

Run these from the `product-service/` directory.

### Build

```bash
./mvnw clean compile
```

### Run Tests

```bash
./mvnw test
```

### Run Application

```bash
./mvnw spring-boot:run
```

## Test Reports

After running tests, reports are generated at:

- `product-service/target/surefire-reports/`

If JaCoCo is enabled in your Maven configuration, coverage reports are typically under:

- `product-service/target/site/jacoco/`

## Suggested Workflow

1. Create a feature branch.
2. Make changes and run `./mvnw test`.
3. Push branch and open a Pull Request.
4. Confirm GitHub Actions CI passes.

## Notes

- The repository root is different from the Maven module root.
- Most Java commands should be run from `product-service/`.
