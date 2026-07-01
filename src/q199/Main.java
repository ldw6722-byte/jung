package q199;

import java.util.Scanner;

class Student {
    String name;
    int s1, s2, s3, total;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].name = scanner.next();
            students[i].s1 = scanner.nextInt();
            students[i].s2 = scanner.nextInt();
            students[i].s3 = scanner.nextInt();
            students[i].total = students[i].s1 + students[i].s2 + students[i].s3;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].total < students[j].total) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].s1 + " " + students[i].s2 + " " +
                    students[i].s3 + " " + students[i].total);
        }
    }
}