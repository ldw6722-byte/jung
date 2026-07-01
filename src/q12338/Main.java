package q12338;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int start = Math.min(a, b);
//        int end = Math.max(a, b);
//        for (int i = start; i <= end; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            if (i < end) {
//                System.out.println();
//            }
//        }
//    }
//}
//==================================================

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;

        int currentInp = a;
        while (true) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(currentInp + " * " + j + " = " + (currentInp * j));
            }

            if (currentInp == b) {
                break;
            }

            System.out.println();
            currentInp += step;
        }
        sc.close();
    }
}


