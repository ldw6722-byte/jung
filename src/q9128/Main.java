package q9128;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);


        String f1 = sc.next();
        String f2 = sc.next();
        double d1 = Double.parseDouble(f1);
        double d2 = Double.parseDouble(f2);

        System.out.println(s1 + " + " + s2 + " = " + (i1 + i2));
        System.out.printf("%s + %s = %.2f\n", f1, f2, (d1 + d2));
    }
}