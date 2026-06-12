package q9037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();
        sc.close();

//        System.out.println(score);

        char grade = '\0';
        if (90 <= score && score <= 100) {
            grade = 'A';
        } else if (80 <= score && score <= 89) {
            grade = 'B';
        } else if (70 <= score && score <= 79) {
            grade = 'C';
        } else if (60 <= score && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);
    }
}