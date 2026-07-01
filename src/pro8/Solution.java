package pro8;

class Solution {
    public int solution(int n) {
        int count = 0;
        int num = 0;
        while (count < n) {
            num++;
            if (!isCursed(num)) {
                count++;
            }
        }
        return num;
    }

    private boolean isCursed(int num) {
        if (num % 3 == 0) {
            return true;
        }
        return String.valueOf(num).contains("3");
    }
}