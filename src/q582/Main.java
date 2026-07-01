package q582;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();
        double radius = Math.sqrt(area / 3.14);
        System.out.printf("%.2f", radius);
        scanner.close();
    }
}