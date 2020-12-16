import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++){
            int t = target - nums[i];
            if(m.containsKey(t)){
                return new int[]{m.get(t),i};
            }
            else{
                m.put(nums[i],i);
            }
        }
        return null;
        
    }
}