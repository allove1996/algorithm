package array;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int p = 1, q = 2, k = 0;
        for (int i = 3; i <= n; i++) {
            k = p + q;
            p = q;
            q = k;
        }

        return k;
    }
}
