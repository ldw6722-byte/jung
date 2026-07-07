package q9055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int currentSum = 0;
        int number = 0;
        while (true) {
            number++;
            currentSum += number;
            if (currentSum > target) {
                break;
            }
        }
        System.out.println(number + " " + currentSum);
    }
}