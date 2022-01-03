import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] ints = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 17);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(nums[0], 0);

        int index1 = 0, index2 = 0;

        for(int i=1; i<nums.length; i++){
            if(hashMap.containsKey(target - nums[i])) {
                index1 = hashMap.get(target - nums[i]);
                index2 = i;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{index1, index2};
    }

}
