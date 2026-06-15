package pro3;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {1, 2, 3, 4, 5};
        int[] result = sol.solution(input);

        System.out.print("결과값: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i == result.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}