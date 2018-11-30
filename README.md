# circle-ci-poc-consumer

## Purpose
This project is an test app that consumes the library created the the circle-ci-poc project.

## HOWTO
Edit the below snippet in the pom.xml file to consume whatever version you create
```xml
<dependency>
  <groupId>com.example</groupId>
  <artifactId>demo</artifactId>
  <version>v0.0.6-alpha</version>
</dependency>
```

Run: `./mvnw clean install` to verify the build.
