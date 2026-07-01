package q613;

import java.util.Scanner;

class StudentInfo {
    String name;
    String school;
    int grade;

    public StudentInfo(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();

        StudentInfo student = new StudentInfo(name, school, grade);

        System.out.println("Name : " + student.name);
        System.out.println("School : " + student.school);
        System.out.println("Grade : " + student.grade);
    }
}