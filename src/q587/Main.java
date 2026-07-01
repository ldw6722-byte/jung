package q587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRecursive(n);
        sc.close();
    }

    public static void printRecursive(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("recursive");
        printRecursive(n - 1);
    }
}