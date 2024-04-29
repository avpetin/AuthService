FROM openjdk:17-jdk-slim AS build
LABEL authors="alexvp"

EXPOSE 8080

COPY target/AuthService-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]