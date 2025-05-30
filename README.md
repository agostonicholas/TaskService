# Task & Contact Service - JUnit Testing Project

This project was developed as part of a school assignment for a Computer Science course at Southern New Hampshire University. The goal was to implement and test two Java service classes — one for managing contacts and another for managing tasks — using **JUnit 5** for comprehensive unit testing.

## 📌 Project Overview

The application includes:

- `ContactService` – Manages contact objects with unique IDs and supports adding, deleting, and updating contacts.
- `TaskService` – Manages task objects with validation, unique IDs, and methods for modifying specific fields.

Each service class is supported by a corresponding data model (`Contact`, `Task`) that enforces strict validation rules in its constructor and mutators.

## 🧪 Testing

JUnit 5 was used to write a full suite of unit tests covering:

- Valid and invalid input scenarios
- Exception handling using `assertThrows`
- Field-specific updates and verifications using `assertEquals`
- ID uniqueness enforcement

The tests were structured to directly align with the software requirements and provide high coverage.

## 🧠 Concepts and Structures Used

- **HashMap**: Used to store and access objects by unique ID for efficient lookup and modification.
- **Exception Handling**: Applied in the service classes to enforce data integrity and validation.
- **Encapsulation**: Ensured through private fields and public accessors/mutators.
- **Immutability**: Applied to task/contact IDs using `final` keyword to prevent unintended changes after object creation.

## 🛠 Technologies

- Java 21
- Maven (for dependency management and project structure)
- JUnit 5
- Tested and run using terminal and IDE-integrated runners
