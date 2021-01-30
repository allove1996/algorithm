package arrayAndLinkedList;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int i = 1, j = 2, k = 0;
        for (int m = 3; m <= n; m++) {
            k = i + j;
            i = j;
            j = k;
        }

        return k;
    }
}
