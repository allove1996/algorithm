package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            return new int[]{};
        }

        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (cache.containsKey(target - nums[i])) {
                return new int[]{i, cache.get(target - nums[i])};
            } else {
                cache.put(nums[i], i);
            }

        }
        return new int[]{};
    }
}
