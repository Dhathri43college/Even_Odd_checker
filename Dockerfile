# Stage 1: Build Java Application
FROM maven:3.9.5-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Stage 2: Create Runtime Image with ONLY Java JRE
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the built JAR directly from the builder phase
COPY --from=builder /app/target/even-odd-checker-1.0-SNAPSHOT.jar ./app.jar

# Command to execute the Java JAR directly
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["5"]
