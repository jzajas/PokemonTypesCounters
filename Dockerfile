# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the executable jar file from the host machine into the container
COPY target/typesCounters-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Set the command to run your jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
