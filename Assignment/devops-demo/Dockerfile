# Fetch Java
FROM eclipse-temurin:21-jdk-alpine
# Set working directory inside the container
WORKDIR /app
# Expose port 8080
EXPOSE 8080
# Set a docker volume if you want
VOLUME /backend_volume
# Add the jar file
ADD /target/*.jar devops-demo-1.0.jar
# Start the application
ENTRYPOINT ["java", "-jar", "/devops-demo-1.0.jar"]