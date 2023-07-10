# spring-api-h2

This is a README file for a Spring API Java project using an H2 database. It provides an overview of the project, installation instructions, and other relevant information.

Project Overview

This project is a Spring API application that utilizes the H2 database for data storage. It aims to provide a RESTful API for performing various operations on a dataset. The project is built using Java and the Spring framework, which offers a robust and flexible platform for developing web applications.

Configuration

The application is configured to use the H2 in-memory database by default. The database settings can be modified in the application.properties file located in the src/main/resources directory. You can change the database URL, username, password, and other settings as per your requirements.


API Endpoints

The following are the main API endpoints provided by this project:

    GET /api/data: Retrieves all data from the database.
    GET /api/data/{id}: Retrieves data with the specified ID.
    POST /api/data: Creates a new data entry.
    PUT /api/data/{id}: Updates an existing data entry.
    DELETE /api/data/{id}: Deletes the data entry with the specified ID.

You can test these endpoints using tools like cURL, Postman, or any other HTTP client.
