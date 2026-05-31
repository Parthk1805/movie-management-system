# Movie Management System

**Spring Boot | Spring MVC | JPA | PostgreSQL | Pagination | Search | Responsive CSS**

## 📋 Overview

A full-stack movie management web application built with Spring Boot 4.0.6 and Java 17. The application demonstrates enterprise-grade Java development practices including clean architecture, pagination, search functionality, and professional UI/UX with responsive CSS styling.

### ✨ Key Features

✅ **Complete CRUD Operations** - Create, Read, Update, Delete movies  
✅ **Pagination** - Efficient data display with Spring Data Page<T>  
✅ **Search Functionality** - Case-insensitive movie name search  
✅ **Sorting** - Automatic sorting by movie name  
✅ **Clean MVC Architecture** - Separation of concerns  
✅ **Spring Data JPA** - Hibernate ORM for database operations  
✅ **PostgreSQL Integration** - Relational database with optimized queries  
✅ **Professional CSS** - Responsive, modern UI design  
✅ **Form Validation** - Input validation and error handling  

---

## 🛠 Tech Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| **Framework** | Spring Boot | 4.0.6 |
| **Language** | Java | 17 |
| **ORM** | Spring Data JPA / Hibernate | Latest |
| **Database** | PostgreSQL | 12+ |
| **Build Tool** | Maven | 3.6+ |
| **Frontend** | JSP / HTML / CSS | - |
| **Templating** | JSTL | Jakarta |
| **CSS Framework** | Bootstrap 5 + Custom CSS | 5.0.2 |

---

## 📥 Installation & Setup

### Prerequisites

- Java 17 or higher
- PostgreSQL 12 or higher
- Maven 3.6 or higher
- Git

### Quick Start

1. **Clone Repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/movie-management-system.git
   cd movie-management-system

##Crate Database 
CREATE DATABASE movie_db;


##Configure Database Connection
Edit src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/movie_db
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

##Build & Run
mvn clean install
mvn spring-boot:run

##Access Application
http://localhost:8080


🏗 Architecture :-
Controller (MovieController)
    ↓
Repository (movieRepo - Spring Data JPA)
    ↓
Entity (Movie - JPA annotated)
    ↓
PostgreSQL Database

## Design Patterns Used
MVC Pattern - Clear separation of Model, View, Controller
Repository Pattern - Data access abstraction
Dependency Injection - Spring's @Autowired annotation


📊 Project Structure
src/
├── main/
│   ├── java/com/jsp/MovieProject/
│   │   ├── controller/MovieController.java
│   │   ├── entity/Movie.java
│   │   ├── repo/movieRepo.java
│   │   └── MovieProjectApplication.java
│   ├── resources/
│   │   ├── application.properties
│   │   └── static/css/style.css
│   └── webapp/WEB-INF/views/
│       ├── home.jsp
│       ├── register.jsp
│       ├── display.jsp
│       ├── update.jsp
│       ├── search.jsp
│       └── pagination.jsp
└── test/
    └── java/.../MovieProjectApplicationTests.java


📚 What I Learned
✓ Enterprise Java development with Spring Boot
✓ Spring Data JPA and Hibernate ORM
✓ PostgreSQL database design and optimization
✓ Spring MVC architecture and design patterns
✓ Pagination implementation for large datasets
✓ Full-stack development (backend to UI)
✓ Responsive CSS and UI/UX design
✓ Git version control and GitHub workflow


📈 Statistics
Files: 19 project files
Code Quality: Clean, readable, professional
Database: PostgreSQL with optimized queries
UI: Professional CSS styling with Bootstrap


🚢 Deployment
Ready for production deployment with:
✓ Proper error handling
✓ Input validation
✓ Database transaction management
✓ Responsive design
✓ Clean code architecture

📧 Author
Parth Kulkarni
GitHub: github.com/Parthk1805
LinkedIn: linkedin.com/in/parth-kulkarni-9321b524a


📜 License
MIT License - Feel free to use this project for learning and development

