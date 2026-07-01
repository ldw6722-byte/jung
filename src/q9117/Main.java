package q9117;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            str = str.substring(1) + str.charAt(0);
            System.out.println(str);
        }
        sc.close();
    }
}