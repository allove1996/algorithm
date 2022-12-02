package array;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    Map<Integer, Integer> resultMap = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 3) {
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


    /*{
        if (n <= 2) {
            return n;
        }

        if (resultMap.containsKey(n)){
            return resultMap.get(n);
        }

        int result = climbStairs(n - 1) + climbStairs(n - 2);
        resultMap.put(n, result);
        return result;
    }
*/

    public static void main(String[] args) {
        int k = new ClimbStairs().climbStairs(4);
        System.out.println(k);
    }
}
