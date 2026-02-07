# java-ac4y-indicator-rest-service

WAR application with Jersey 1.x REST endpoints for indicator operations.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-indicator-rest-service`
- **Version**: `1.0.0`

## Description

RESTful web service (WAR) providing HTTP endpoints for indicator analytics, transfers, balance queries, storno, delete, and list operations. Uses Jersey 1.x (JAX-RS) with POST-based JSON API. Also includes a secondary G8H REST endpoint.

### Key Classes

- `Ac4yIndicatorRestfulService` - Main REST endpoint class
- `Ac4yGUID8HumanIDRestfulService` - Secondary G8H REST endpoint

## Dependencies

- `ac4y-indicator-object-service` (service layer)
- `ac4y-service-common` (common DTOs)
- `ac4y-base4jsonandxml` (serialization)
- Jersey 1.x (JAX-RS)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJIndicatorModule/Ac4yIndicatorRestService`.
