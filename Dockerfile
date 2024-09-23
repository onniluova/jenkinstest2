# Use Maven as the base image (includes Java)
FROM maven:latest

# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY . /app

# Build the project
RUN mvn clean install

# List contents of target directory (for debugging)
RUN ls -l target

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "target/jenkinstest2-1.0-SNAPSHOT.jar"]