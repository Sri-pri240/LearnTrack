# LearnTrack: Student & Course Management System

LearnTrack is a console-based application built using Core Java to manage students, courses, and academic enrollments. It implements core OOP principles like encapsulation, inheritance, and polymorphism.

## 🛠️ Compilation & Run Guide
To run this application via terminal, navigate to the project root and execute:

  javac -d out src/com/airtribe/learntrack/util/*.java src/com/airtribe/learntrack/exception/*.java src/com/airtribe/learntrack/entity/*.java src/com/airtribe/learntrack/service/*.java src/com/airtribe/learntrack/ui/*.java

  java -cp out com.airtribe.learntrack.ui.Main

## 📊 Class Diagram Architecture

       +-----------------------------------+

       |              Person               |
       +-----------------------------------+

       | - id: String                      |
       | - firstName: String               |
       | - lastName: String                |
       | - email: String                   |
       +-----------------------------------+

       | + getDisplayName(): String        |
       +-----------------------------------+
                         ^
                         |
        +----------------+----------------+

        |                                 |
+-----------------------+         +-----------------------+

|        Student        |         |        Course         |
+-----------------------+         +-----------------------+

| - batch: String       |         | - id: String          |
| - active: boolean     |         | - courseName: String  |
+-----------------------+         | - active: boolean     |

| + getDisplayName()    |         +-----------------------+
+-----------------------+

## 📂 Project Structure
- `entity`: Contains core models like Person, Student, and Course.
- `service`: Handles business logic and data operations using ArrayList.
- `exception`: Manages custom application errors (e.g., EntityNotFoundException).
- `util`: Global helper classes like IdGenerator.
- `ui`: Driver console class containing the user menu system. 
