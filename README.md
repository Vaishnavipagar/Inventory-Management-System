📦 Inventory Management System

A web-based Inventory Management System developed using Java Spring Boot.
This application allows users to manage products, track stock quantity, and perform CRUD operations (Create, Read, Update, Delete) easily.

The project demonstrates the use of Spring Boot, Spring MVC, Thymeleaf, JPA (Hibernate), and MySQL following MVC architecture.



🚀 Features

➕ Add new product

✏️ Update product details

❌ Delete product

📋 View all products

📦 Track product quantity

🧾 Database storage

🌐 User-friendly interface

⚙️ MVC architecture implementation

🛠️ Technologies Used

--Backend

Java 17

Spring Boot

Spring MVC

Spring Data JPA (Hibernate)

--Frontend

Thymeleaf

HTML

CSS

Bootstrap

--Database

MySQL

--Tools

Spring Tool Suite (STS) / Eclipse

Maven

Git & GitHub


📂 Project Structure
inventory-management
│
├── src/main/java/com/company/inventory
│   ├── controller
│   ├── model
│   ├── repository
│   ├── service
│   └── exception
│
├── src/main/resources
│   ├── templates
│   │   ├── index.html
│   │   ├── add-product.html
│   │   └── update-product.html
│   ├── static
│   └── application.properties
│
└── pom.xml



⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/your-username/inventory-management.git
cd inventory-management
2️⃣ Create MySQL Database

Open MySQL and run:

CREATE DATABASE inventory_db;
3️⃣ Configure Database

Open file:

src/main/resources/application.properties

Add your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.thymeleaf.cache=false
server.port=8081
4️⃣ Run the Project

Using Spring Tool Suite (STS):

Right click on project

Run As → Spring Boot App

OR using Maven:

mvn spring-boot:run

🌐 Application URL

After running the project open:

http://localhost:8081/


Learning Outcomes

From this project you can learn:

Spring Boot project setup

MVC architecture

Controller → Service → Repository workflow

CRUD operations

Database integration using JPA & Hibernate

Thymeleaf template engine

🔮 Future Improvements

Login & Registration (Spring Security)

Admin & User roles

Low stock alert

Export data to Excel/PDF

REST API version


👩‍💻 Author

Vaishnavi Pagar
