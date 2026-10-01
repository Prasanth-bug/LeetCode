import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int x =1;
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                x++;
            }
        }
        return x;
    }
}