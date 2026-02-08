#  Movie Streaming Backend System

A backend REST API for a movie streaming platform built using **Spring Boot** and **MySQL**.  
This project demonstrates clean layered architecture, RESTful API design, database integration, and basic business logic.

---

##  Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- MySQL
- Postman
- Git & GitHub

---

##  Project Modules

- User Management
- Movie Management
- Genre Management
- Rating System
- Watch History (Basic)

---

##  Architecture

The project follows **Layered Architecture**:

- Controller Layer – Handles HTTP requests
- Service Layer – Business logic
- Repository Layer – Database operations using JPA
- Entity Layer – Database mapping

---

##  API List

###  User APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/users/register` | Register a new user |
| GET | `/api/users/email/{email}` | Get user by email |

---

###  Movie APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/movies` | Add a movie |
| GET | `/api/movies` | Get all movies |
| GET | `/api/movies/{id}` | Get movie by ID |
| PUT | `/api/movies/{id}` | Update movie |
| DELETE | `/api/movies/{id}` | Delete movie |

---

###  Genre APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/genres` | Add genre |
| GET | `/api/genres` | Get all genres |
| GET | `/api/genres/{id}` | Get genre by ID |
| PUT | `/api/genres/{id}` | Update genre |
| DELETE | `/api/genres/{id}` | Delete genre |

---

### Rating APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/ratings` | Add rating (1–10) |
| GET | `/api/ratings/movie/{movieId}` | Get ratings for a movie |

---

###  Watch History APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/watch-history?userId=&movieId=` | Add watch history |
| GET | `/api/watch-history/user/{userId}` | Get watch history by user |

---

##  Database

- MySQL relational database
- Entity relationships using `@ManyToOne`
- Tables: users, movies, genres, ratings, watch_history

---

## API Testing

- All APIs tested using **Postman**
- Verified database records using SQL queries

---

## How to Run the Project

1. Clone the repository
2. Configure MySQL database in `application.properties`
3. Run the Spring Boot application
4. Test APIs using Postman

---

##  Future Improvements

- Authentication & Authorization (JWT)
- Pagination & Sorting
- DTO usage
- Global exception handling improvements

---

## Author

**Amisha Khunte**  
Java Backend Developer (Fresher)

re

