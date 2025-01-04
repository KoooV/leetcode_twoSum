import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Метод для поиска двух чисел, сумма которых равна target
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int subset = target - nums[i];
            if (map.containsKey(subset)) {
                return new int[]{map.get(subset), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


}