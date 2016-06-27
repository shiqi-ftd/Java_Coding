public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        HashSet<Integer> cur = new HashSet<>();
        return countNoneRepeat(n, cur);
    }

    public int countNoneRepeat(int n, HashSet<Integer> cur) {
        if (n < 1) {
            return 1;
        }

        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (!cur.contains(i)) {
                cur.add(i);
                result += countNoneRepeat(n - 1, cur);
                cur.remove(i);
            } else {
                if (i == 0 && cur.size() == 1) {
                    cur.remove(0);
                    result += countNoneRepeat(n - 1, cur);
                }
            }
        }
        return result;
    }
}