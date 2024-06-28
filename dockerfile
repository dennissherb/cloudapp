# Use an official OpenJDK 21 runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container at /app
COPY target/cloudapp-0.0.1-SNAPSHOT.jar /app/cloudapp-0.0.1-SNAPSHOT.jar

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "cloudapp-0.0.1-SNAPSHOT.jar"]

