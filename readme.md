# Spring Boot REST API

## Project Overview
This is a simple Spring Boot REST API for managing student information, providing endpoints to retrieve student details based on various criteria.

## Project Structure
- `AppController.java`: Main REST controller with endpoints for student operations
- `Student.java`: Model class representing student attributes

## Prerequisites
- Java 8 or higher
- Spring Boot
- Maven or Gradle

## Dependencies
- Spring Web
- Java Utilities

## Endpoints

### 1. Welcome Message
- **URL:** `/app/msg`
- **Method:** GET
- **Response:** "Hello Spring Boot!"
  

### 2. Age Endpoint
- **URL:** `/app/age/{age}`
- **Method:** GET
- **Description:** Returns a message with the provided age
- **Example:** `/app/age/23` returns "My age is 23"

      
### 3. Get Single Student
- **URL:** `/app/student`
- **Method:** GET
- **Description:** Returns the first predefined student (s1)

### 4. Get All Students
- **URL:** `/app/students`
- **Method:** GET
- **Description:** Returns a list of all predefined students

### 5. Get Student by Registration Number
- **URL:** `/app/students/{regNo}`
- **Method:** GET
- **Description:** Returns a specific student by their registration number

### 6. Get Students by Age Range
- **URL:** `/app/ages`
- **Method:** GET
- **Description:** Returns students between ages 20-23
   
### 7. Get Students Sorted by GPA
- **URL:** `/app/students/gpa`
- **Method:** GET
- **Description:** Returns students sorted by GPA in ascending order

## Student Model
The `Student` class has the following attributes:
- `regNo`: Registration Number (String)
- `name`: Student Name (String)
- `age`: Student Age (Integer)
- `course`: Student's Course (String)
- `gpa`: Student's Grade Point Average (Double)




