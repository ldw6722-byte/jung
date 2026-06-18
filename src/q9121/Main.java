package q9121;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information",
                "lesson", "book", "lion"};

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        char target = sc.next().charAt(0);

        boolean found = false;
        for (String word : words) {
            if (word.charAt(0) == target) {
                System.out.println(word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("찾는 단어가 없습니다");
        }
    }
}
