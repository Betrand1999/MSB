# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/java-project-0.0.1-SNAPSHOT.war /app/java-project-0.0.1-SNAPSHOT.war


# Run the Spring Boot application
CMD ["java", "-jar", "java-project-0.0.1-SNAPSHOT.war"]
