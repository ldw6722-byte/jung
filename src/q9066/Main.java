package q9066;

public class Main {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = alphabet.length - 1; i >= 0; i--) {
            System.out.print(alphabet[i] + " ");
        }
    }
}