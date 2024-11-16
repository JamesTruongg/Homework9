import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> student = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add a new student
    public void addStudent() {
        Student student = new Student("", "", "", 0, null);
        student.EnterStudentInfo();
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                student.DisplayInfo();
            }
        }
    }

    // Search student by ID
    public void searchStudentById() {
        System.out.print("Enter student ID to search: ");
        String id = sc.nextLine();
        for (Student student : students) {
            if (student.Id.equals(id)) {
                System.out.println("Student found:");
                student.DisplayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Delete student by ID
    public void deleteStudentById() {
        System.out.print("Enter student ID to delete: ");
        String id = sc.nextLine();
        for (Student student : students) {
            if (student.Id.equals(id)) {
                students.remove(student);
                System.out.println("Student with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Edit student by ID
    public void editStudentById() {
        System.out.print("Enter student ID to edit: ");
        String id = sc.nextLine();
        for (Student student : students) {
            if (student.Id.equals(id)) {
                System.out.println("Editing student information:");
                student.EnterStudentInfo();
                System.out.println("Student information updated.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
