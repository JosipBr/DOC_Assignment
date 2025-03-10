# Use Eclipse Temurin JDK 21 with Alpine as the base image
FROM eclipse-temurin:21-jdk-alpine

# Expose port 8080
EXPOSE 8080

# Set a Docker volume (optional)
VOLUME /tmp

# Add the JAR file to the container
ADD target/*.jar spring-boot-docker-app1-0.0.1-SNAPSHOT.jar

# Start the application
ENTRYPOINT ["java", "-jar", "/spring-boot-docker-app1-0.0.1-SNAPSHOT.jar"]
