import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    String Id, FullName, Major;
    float Gpa;
    Date dateOfBirth;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Student(String id, String fullName, String major, float gpa, Date dateOfBirth) {
        this.Id = id;
        this.FullName = fullName;
        this.Major = major;
        this.Gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public void EnterStudentInfo() {
        System.out.print("Enter Id: ");
        this.Id = sc.nextLine();
        System.out.print("Enter Fullname: ");
        this.FullName = sc.nextLine();
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        String inputDate = sc.nextLine();
        try {
            this.dateOfBirth = dateFormat.parse(inputDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter in dd/MM/yyyy format.");
        }
        System.out.print("Enter major: ");
        this.Major = sc.nextLine();
        System.out.print("Enter GPA: ");
        this.Gpa = sc.nextFloat();
    }

    public void DisplayInfo() {
        System.out.println("Id: " + Id +
                ", Full name: " + FullName +
                ", Date of birth: " + dateFormat.format(dateOfBirth) +
                ", Major: " + Major +
                ", GPA: " + Gpa);
    }

    public static void main(String[] args) {
        Student student = new Student("", "", "", 0, null);
        student.EnterStudentInfo();
        student.DisplayInfo();
    }
}
