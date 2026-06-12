package pro2;

public class Solution {
    public int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(1.42));
        System.out.println(sol.solution(69.32));
    }
}