package q9042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            sum += n;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("입력된 자료의 개수 = " + count);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
    }
}
