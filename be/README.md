# Project-Management

## Backend
Spring Boot application using Maven.

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6.3 or higher

### 1. Clone the repository

```sh
https://github.com/Graduation-Thesis-20194806/Project-Management.git
cd Project-Management
```
### 2. Build the project
```sh
mvn clean install
```

### 3. Run the application
```sh
mvn spring-boot:run
```

### 4. Access the application
Open your browser and go to: http://localhost:8080/swagger-ui/

### 5. Run test
```sh
mvn test
```

### 6. Packaging and Running the Application
To package the application into a JAR file and run it, use the following commands:
```sh
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### 7. Dockerize
```sh
cd path/to/source/Project-Management
docker build -t backend .
docker run -d --name backend -p 8080:8080 --restart=always backend
```
## Database - MySQL
### Prerequisites
- Docker engine
  - [Docker Desktop for Linux](https://docs.docker.com/desktop/install/linux-install/) 
  - [Docker Desktop for Mac (macOS)](https://docs.docker.com/desktop/install/mac-install/)
  - [Docker Desktop for Windows](https://docs.docker.com/desktop/install/windows-install/)
### Run docker compose
Make sure port in docker compose file is free
```sh
cd path/to/source/Project-Management
docker compose -f docker-compose.db.yml up -d
```