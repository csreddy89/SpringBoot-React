# Step 1: Build the app
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copy Maven files
COPY SpringBoot/pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY SpringBoot/src ./src

# Build the app
RUN mvn clean package -DskipTests

# Step 2: Create minimal image
FROM eclipse-temurin:17-jdk
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
