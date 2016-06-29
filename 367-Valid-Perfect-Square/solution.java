public class Solution {
    public boolean isPerfectSquare(int num) {
        double start = 1, end = num;
        while (start + 1 < end) {
            double mid = (end - start) / 2 + start;
            if (mid * mid == num) return true;
            if (mid * mid < num && (mid + 1) * (mid + 1) > num) return false;
            if (mid * mid < num) start = mid;
                else end = mid;
         }
         if (start * start == num || end * end == num) return true;
            return false;
    }
}