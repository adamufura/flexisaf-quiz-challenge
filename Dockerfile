# Use a base image with Java
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot application jar file to the container
COPY target/flexisafquiz-0.0.1-SNAPSHOT.jar /app/flexisafquiz.jar

# Expose the port your Spring Boot application will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "flexisafquiz.jar"]
