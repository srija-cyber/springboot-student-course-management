# Spring Boot Student Course Management System

## README.md

# Student Course Management System

A Spring Boot CRUD application developed using Java, Spring Boot, JSP, JPA/Hibernate, and MySQL.

## Features

* Add Students
* View Students
* Update Student Details
* Course and Student Relationship
* MySQL Database Integration
* JSP Frontend
* JPA/Hibernate ORM
* Custom Inner Join Query
* Exception Handling
* Unit Testing using JUnit and Mockito

## Technologies Used

* Java
* Spring Boot
* MySQL
* JSP
* Hibernate / JPA
* Maven
* IntelliJ IDEA

## Database Relationship

* One Course can have many Students
* One Student belongs to one Course

## Steps to Run

1. Clone Repository
2. Open in IntelliJ IDEA
3. Configure MySQL credentials in application.properties
4. Run the application
5. Open browser:

[http://localhost:8081](http://localhost:8081)

## GitHub Repository

https://github.com/srija-cyber/springboot-student-course-management

---

# PDF DOCUMENT CONTENT

# Title Page

Student Course Management System Using Spring Boot

Name: Dhanwada Srija
ID: 2024EB02088

---

# 1. Introduction

This project is a Spring Boot CRUD application developed to manage Students and Courses using Java, Spring Boot, JSP, Hibernate, and MySQL database.

The application follows the MVC architecture and implements Create, Read, and Update operations.

---

# 2. Technologies Used

* Java
* Spring Boot
* MySQL
* JSP
* JPA / Hibernate
* Maven
* IntelliJ IDEA

<img width="566" height="817" alt="image" src="https://github.com/user-attachments/assets/5123d9f0-9cb1-4148-9e27-1e42ca01330e" />


---

# 3. Entity Relationship Design

The project contains two entities:

1. Student
2. Course

Relationship:

* One Course can have many Students
* One Student belongs to one Course

Annotations Used:

* @Entity
* @Id
* @GeneratedValue
* @OneToMany
* @ManyToOne
* @JoinColumn



---

# 4. Repository Layer

Repository interfaces were created using JpaRepository.

A custom JPQL inner join query was implemented in StudentRepository.

Example:

@Query("SELECT s FROM Student s INNER JOIN s.course c")


---

# 5. Service Layer

Service classes were created to handle business logic and interact with repositories.

Methods implemented:

* saveStudent()
* getAllStudents()
* getStudentsWithCourses()
* getStudentById()


---

# 6. Controller Layer

Spring MVC controllers were implemented using:

* @Controller
* @GetMapping
* @PostMapping

Operations:

* Add Student
* Display Students
* Edit Student
* Update Student

<img width="1574" height="1021" alt="image" src="https://github.com/user-attachments/assets/eb39b210-1ff8-4e57-a65c-3ad8db81df5d" />


---

# 7. View Layer (JSP)

JSP pages created:

* students.jsp
* addStudent.jsp
* editStudent.jsp
* error.jsp

CSS styling was applied to improve UI.

<img width="1919" height="1016" alt="Screenshot 2026-05-02 113421" src="https://github.com/user-attachments/assets/7f22cfdf-4243-40d6-8db0-34c20b109e88" />


---

# 8. CRUD Operations

## Create Operation

A form was implemented to add students.

<img width="1107" height="936" alt="Screenshot 2026-05-02 113502" src="https://github.com/user-attachments/assets/0a027754-4544-48de-a7ce-a844d34236fc" />


## Read Operation

All student details are displayed in a JSP table.


<img width="1919" height="1009" alt="Screenshot 2026-05-02 113510" src="https://github.com/user-attachments/assets/0337bab9-d189-4db0-8093-0f181e56e6ee" />


## Update Operation

Student details can be edited and updated.

<img width="1045" height="1079" alt="Screenshot 2026-05-02 113602" src="https://github.com/user-attachments/assets/52f1396f-ebac-4461-a760-7eb8d10b4a37" />
<img width="1919" height="1011" alt="Screenshot 2026-05-02 113611" src="https://github.com/user-attachments/assets/b5ec3329-62b6-4842-9c27-3aeb9533357d" />



---

# 9. Database Population

A DataLoader class was implemented to insert sample data automatically.

10 student records and course records were inserted.

<img width="898" height="902" alt="Screenshot 2026-05-02 112727" src="https://github.com/user-attachments/assets/f404cfda-30ef-48d0-bcf1-9ae66f254ab7" />
<img width="760" height="893" alt="Screenshot 2026-05-02 112557" src="https://github.com/user-attachments/assets/533716fb-9ade-4d58-a060-8ad5c1285f4b" />

---

# 10. Exception Handling

Exception handling was implemented using:

@ExceptionHandler(DataIntegrityViolationException.class)

An error.jsp page was created to display errors.


---

# 11. Unit Testing

JUnit and Mockito were used for testing.

StudentServiceTest was created to test service methods.

<img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/d5d319ee-84ad-4349-8098-ef1fced15991" />


---

# 12. Challenges Faced

Challenges faced during development:

* Maven dependency issues
* MySQL connection configuration
* Entity scanning issue
* JSP setup configuration
* GitHub authentication issue

Solutions:

* Reloaded Maven dependencies
* Added @EntityScan
* Configured JSP dependencies properly
* Fixed GitHub credentials

---

# 13. Conclusion

The project successfully implemented Create, Read, and Update operations using Spring Boot MVC architecture with MySQL integration.

The application demonstrated entity relationships, repository usage, service layer implementation, JSP frontend integration, and database connectivity.

---

# 14. GitHub URL

https://github.com/srija-cyber/springboot-student-course-management
