### **EventEase - Event Management System**



**Project Structure:**

src

└── main

&#x20;   └── java\\com\\eventease

&#x20;       ├── controller

&#x20;       ├── dto

&#x20;       ├── entity

&#x20;       ├── exception

&#x20;       ├── repository

&#x20;       ├── service

&#x20;       ├── serviceimpl

&#x20;       └── EventeaseApplication.java



**Technologies Used**

\- Java 17

\- Spring Boot

\- Spring Data JPA

\- MySQL

\- Maven

\- Postman

&#x20;**APIs**

Create User

POST /users



Sample Payload:

{

&#x20; "name":"Akshaya",

&#x20; "email":"akshaya@gmail.com"

}



Create Event

POST /events



Sample Payload:

{

&#x20; "title":"Spring Boot Workshop",

&#x20; "description":"Hands-on Spring Boot Training",

&#x20; "date":"2026-08-30",

&#x20; "location":"Chennai"

}



Register User

POST /registrations



Sample Payload:

{

&#x20; "userId":1,

&#x20; "eventId":1

}



Get Registrations By Event

GET /registrations/event/{eventId}

