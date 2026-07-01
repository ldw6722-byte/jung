package q9074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[11];

        while (true) {
            int num = sc.nextInt();
            if (num < 1 || num > 10) {
                break;
            }
            counts[num]++;
        }

        for (int i = 1; i <= 10; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " : " + counts[i] + "개");
            }
        }
        sc.close();
    }
}
