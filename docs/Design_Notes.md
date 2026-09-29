# Structural System Design Notes

### 1. Choice of ArrayList over Traditional Fixed Arrays
Traditional arrays have a fixed size upon creation. `ArrayList` grows dynamically, making it perfect for managing a variable number of students without manual array resizing logic.

### 2. Static Members Usage
The `IdGenerator` counters are declared `static` because ID tracking needs to stay uniform across the entire app instead of resetting with every new object instance.

### 3. Inheritance Mechanics
`Student` extends `Person` to inherit common fields like ID, first name, last name, and email, which prevents rewriting redundant lines of code.