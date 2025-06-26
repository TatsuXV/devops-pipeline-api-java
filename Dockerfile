FROM eclipse-temurin:21
WORKDIR /app
COPY target/api-0.0.1-SNAPSHOT.jar devopsdocker.jar
ENTRYPOINT ["java", "-jar", "devopsdocker.jar"]