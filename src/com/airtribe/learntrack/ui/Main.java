package com.airtribe.learntrack.ui;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== LearnTrack Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Deactivate Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter First Name: ");
                        String fname = scanner.nextLine();
                        System.out.print("Enter Last Name: ");
                        String lname = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Batch: ");
                        String batch = scanner.nextLine();
                        studentService.addStudent(fname, lname, email, batch);
                        break;
                    case 2:
                        studentService.viewAllStudents();
                        break;
                    case 3:
                        System.out.print("Enter Student ID to deactivate: ");
                        String id = scanner.nextLine();
                        studentService.deactivateStudent(id);
                        break;
                    case 4:
                        System.out.println("Exiting... Thank you!");
                        return;
                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            } catch (EntityNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

