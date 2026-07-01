package q9052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f", average);
    }
}
