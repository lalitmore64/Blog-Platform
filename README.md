# 📝 Blog Platform – Spring Boot REST API

A production-ready Blog Platform REST API built using Java Spring Boot.  
This application provides secure authentication using JWT, role-based authorization using Spring Security, and persistent storage using PostgreSQL and H2. The project is fully containerized using Docker.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot
- Spring Web (REST API)
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA (Hibernate)
- PostgreSQL (Production)
- H2 Database (Development)
- Docker & Docker Compose
- Maven

---

## 🏗️ Architecture

The application follows a layered architecture:

- Controller Layer – REST API endpoints
- Service Layer – Business logic
- Repository Layer – Data access
- Security Layer – JWT authentication & authorization

Role-Based Access Control:

- USER
- ADMIN

---

## 🔐 Security Implementation

- Stateless authentication using JWT
- Password encryption using BCrypt
- Custom JWT authentication filter
- Role-based authorization
- Protected endpoints using Spring Security

### Authentication Flow

1. User registers
2. User logs in
3. Server generates JWT token
4. Client sends token in header:
   Authorization: Bearer <token>
5. JWT filter validates token for every request

---

## 📦 Features

- User Registration & Login
- JWT Authentication
- Role-based Authorization
- Create, Update, Delete Posts
- Categories Management
- Tags Management
- H2 Console (Development)
- PostgreSQL Support (Production)
- Dockerized Application

---

## 🗄️ Database Configuration

### H2 (Development)
