# Architektura - java-ac4y-indicator-rest-service

## Attekintes

WAR alkalmazas Jersey 1.x REST vegpontokkal az indikator muveletekhez.

## Szerkezet

```
src/main/java/ac4y/indicator/service/
  restful/
    Ac4yIndicatorRestfulService.java            - Fo REST vegpont osztaly
  restfulother/
    Ac4yGUID8HumanIDRestfulService.java         - Masodlagos G8H REST vegpont
src/main/webapp/WEB-INF/
  web.xml                                       - Servlet konfiguracio
```

## Fuggosegek

- ac4y-indicator-object-service (szolgaltatas reteg)
- ac4y-service-common (kozos DTO-k)
- ac4y-base4jsonandxml (szerializacio)
- Jersey 1.x (JAX-RS), Apache HttpComponents

## Eredet

Az `IJIndicatorModule/Ac4yIndicatorRestService` modulbol kinyerve.
