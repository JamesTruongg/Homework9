import java.util.Scanner;

public class Proccesor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    studentList.searchStudentById();
                    break;
                case 4:
                    studentList.deleteStudentById();
                    break;
                case 5:
                    studentList.editStudentById();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);


    }
}
