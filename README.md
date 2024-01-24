<h3><b>Java Spring CRUD Application</b></h3>
Project Overview
This project is a simple Java CRUD (Create, Read, Update, Delete) application using the Spring framework. It provides basic functionalities to manage a list of products, allowing users to create, retrieve, update, and delete products.

Technologies Used
Java
Spring Framework (Spring Boot)
Maven (for dependency management)
RESTful API
Project Structure
com.praveen.sample.controller: Contains the controllers responsible for handling incoming HTTP requests.
com.praveen.sample.model: Defines the data model for the product entity.
com.praveen.sample.service: Manages the business logic and interacts with the data layer.
Setup Instructions
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/spring-crud-sample.git
Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

Build and run the application.

bash
Copy code
mvn spring-boot:run
Access the application using the base URL: http://localhost:8080

API Endpoints
Create Product
Endpoint: POST /api/createProduct

Description: Creates a new product.

Request Body: JSON representation of the product.

Example Request:

bash
Copy code
curl -X POST -H "Content-Type: application/json" -d '{"name":"Sample Product","price":19.99}' http://localhost:8080/api/createProduct
Get All Products
Endpoint: GET /api/getAllProducts

Description: Retrieves a list of all products.

Example Request:

bash
Copy code
curl http://localhost:8080/api/getAllProducts
Get Product by ID
Endpoint: GET /api/getById/{id}

Description: Retrieves a product by its ID.

Path Variable: id - ID of the product.

Example Request:

bash
Copy code
curl http://localhost:8080/api/getById/1
Update Product
Endpoint: PUT /api/{id}

Description: Updates an existing product by ID.

Path Variable: id - ID of the product.

Request Body: JSON representation of the updated product.

Example Request:

bash
Copy code
curl -X PUT -H "Content-Type: application/json" -d '{"name":"Updated Product","price":29.99}' http://localhost:8080/api/1
Delete Product by ID
Endpoint: DELETE /api/deleteById/{id}

Description: Deletes a product by its ID.

Path Variable: id - ID of the product.

Example Request:

bash
Copy code
curl -X DELETE http://localhost:8080/api/deleteById/1
Dependencies
The project relies on the following dependencies, which are managed by Maven:

Spring Boot Starter Web: Provides web support for building RESTful applications.
Spring Boot Starter Data JPA: Simplifies database operations using the Java Persistence API (JPA).
Mongo Database: In-memory database for storing product data during development.
Contributing
 
