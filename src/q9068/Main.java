package q9068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            arr[i] = input;
            count++;
        }
        for (int i = 1; i < count; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}