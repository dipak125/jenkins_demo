
FROM eclipse-temurin:8-jre

WORKDIR /app

COPY target/docker-jenkins-integration-sample.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
