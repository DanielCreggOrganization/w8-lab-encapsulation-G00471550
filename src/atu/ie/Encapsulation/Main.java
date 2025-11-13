package atu.ie.Encapsulation;

public class Main {
    public static void main(String[] args) {
         Student student = new Student("John Doe", 12345, 3.8);
        
        student.name = "";
        student.studentId = -1;
        student.gpa = 5.5;

        System.out.println("Student Name: " + student.name);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student GPA: " + student.gpa);

System.out.println();

        SecretMessage secret = new SecretMessage("Hello, World!");

        secret.displayMessage();

System.out.println();

         Temperature temp = new Temperature();

        temp.setCelsius(36);

        double currentTemp = temp.getCelsius();

        System.out.println("The current temperature is: " + currentTemp + "°C");

System.out.println();

        Grade grade = new Grade("Alice Johnson", 85, "MATH101");

        System.out.println("Student Name: " + grade.getName());
        System.out.println("Numeric Grade: " + grade.getGrade());
        System.out.println("Course Code: " + grade.getCode());

    }
}
