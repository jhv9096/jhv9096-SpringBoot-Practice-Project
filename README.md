# Task Manager API

A simple Spring Boot REST API for managing tasks.
Built as a practice project to enhance my Java knowledge while exploring Spring Boot, RESTful APIs, and Maven.
<br>
<small>Made using assistance from Microsoft Copilot</small>
<br>
<br>
## Getting Started

To run this project locally:

1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/task-manager-api.git
   
2. Navigate into the project folder:
    ```bash
   cd task-manager-practice
   
3. Run the app:
    ```bash
   mvn spring-boot:run

## Features

### Complete:
- Create, read, update, and delete tasks
- Swagger UI Integration
- H2 Database
- Database file persistence

### Planned:
- RESTful API design
- Update ```TaskController``` ```deleteTask``` to use ```delete``` instead of ```deleteById```
- Add more secure logging to ```deleteTask```
- Add Authentication to endpoints using Spring-Security and role-based access
- Add pagination and filtering using ```Pageable``` and ```Sort```, allowing querying tasks by status, due date, etc.
- Write Unit and Integration tests with JUnit and Mockito. Include validation, error handling, and edge cases.
- Enhance setup instructions in README
- Add Swagger URL and H2 console info to README

## Tech Stack

- Java 21
- Spring Boot
- Maven
- H2 Database
- IntelliJ IDEA Community Edition

## What I Learned
- How to setup a SpringBoot Project
- How to use Spring Annotations
- How to map API commands using Spring
- How to test APIs using Swagger
- How to setup an H2 Database using in-memory storage
- How to setup an H2 Database using file storage for persistence

## License
This project is licensed under the [MIT license](LICENSE).