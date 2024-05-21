package practice.LeetCode150BestSolutions;
 import java.util.HashMap;
 import java.util.Map;

public class JumpGame {
    public static boolean isLastIndexReachable(int[] nums, int index, Map<Integer, Boolean> map) {
        if (index == nums.length - 1) {
            map.put(index, true);
            return true;
        }
        if (map.containsKey(index)) {
            return map.get(index);
        }
        int steps = nums[index];
        for (int i = index + 1; i <= index + steps; i++) {

            if (i < nums.length) {
                System.out.println(index + " " + i);
                boolean result = isLastIndexReachable(nums, i, map);
                if (result) {
                    map.put(index, true);
                    return true;
                }
            }
        }
        map.put(index, false);
        return false;

    }

    public static boolean canJump(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        return isLastIndexReachable(nums, 0, map);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }

}
