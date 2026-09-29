package com.airtribe.learntrack.service;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;
import java.util.ArrayList;

public class StudentService {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String firstName, String lastName, String email, String batch) {
        String id = IdGenerator.getNextStudentId();
        students.add(new Student(id, firstName, lastName, email, batch));
        System.out.println("Student added successfully with ID: " + id);
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println("ID: " + s.getId() + " | Name: " + s.getDisplayName() + " | Status: " + (s.isActive() ? "Active" : "Inactive"));
        }
    }

    public Student searchStudentById(String id) throws EntityNotFoundException {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) return s;
        }
        throw new EntityNotFoundException("Student with ID " + id + " not found!");
    }

    public void deactivateStudent(String id) throws EntityNotFoundException {
        Student s = searchStudentById(id);
        s.setActive(false);
        System.out.println("Student " + id + " deactivated successfully.");
    }
}



