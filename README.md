# Assignment 1 - Dog & Person Classes

## 📌 Student Information
- **Name:** Manav Patel
- **Student ID:** C0932378
- **Course:** Java
- **Instructor:** Prof. Leguia


---

## 📝 **Assignment Description**
This Java project implements two classes: `Dog` and `Person`, following the given assignment requirements. The `Person` class optionally owns a `Dog`, and we implement methods to check if the person has an old dog and to change the dog's name. JUnit tests are provided to validate the functionality.

### **Features Implemented**
✅ `Dog` and `Person` classes with getters, setters, and constructors.  
✅ **No `if` statements** in `hasOldDog()` and `changeDogsName()`.  
✅ Exception handling for attempting to change a non-existent dog’s name.  
✅ Comprehensive **JUnit tests** covering multiple scenarios.  
✅ Proper GitHub workflow and structured project.  

---

## 📂 **Project Structure**
```
Assignment_123456/
│── README.md
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── yourpackage/
│   │   │   │   ├── Dog.java
│   │   │   │   ├── Person.java
│   │   │   │   ├── MainApplication.java
│   ├── test/
│   │   ├── java/
│   │   │   ├── yourpackage/
│   │   │   │   ├── DogTest.java
│   │   │   │   ├── PersonTest.java
```

---

## 🚀 **How to Run the Project**
### **1️⃣ Clone the Repository**
```sh
git clone git@github.com:manavpatel1310/assignment1_C0932378.git
cd Assignment1_C0932378
```

### **2️⃣ Compile and Run the Main Application**
#### **Using IntelliJ/Eclipse**
- Open the project in **IntelliJ IDEA** or **Eclipse**.
- Navigate to `MainApplication.java` and click **Run**.

#### **Using Terminal**
```sh
javac -d out src/main/java/yourpackage/*.java
java -cp out yourpackage.MainApplication
```

---

## ✅ **Running Unit Tests**
### **Using IntelliJ/Eclipse**
- Navigate to `DogTest.java` and `PersonTest.java`
- Right-click and select **Run Tests**

### **Using Maven**
```sh
mvn test
```

### **Using Gradle**
```sh
gradle test
```

