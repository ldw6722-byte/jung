package q9111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "jungol olympiad";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int index = sc.nextInt();
            System.out.print(str.charAt(index));
        }
    }
}