package q9086;

import java.util.Scanner;

public class Main {
    public static double getAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 과목의 점수를 입력하세요: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double avg = getAverage(s1, s2, s3);

        System.out.printf("평균 : %.2f\n", avg);
    }
}