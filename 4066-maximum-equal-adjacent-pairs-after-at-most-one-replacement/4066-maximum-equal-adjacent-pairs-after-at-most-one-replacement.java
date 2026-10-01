import java.util.*;
class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int a =0;
        int max=0;
        HashMap<Long,Integer>map=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                a++;
            }else{
                int s = Math.min(nums[i],nums[i-1]);
                int b = Math.max(nums[i],nums[i-1]);
                long k = ((long)s<<32)^(b&0xffffffffL);
                int cnt = map.getOrDefault(k,0)+1;
                map.put(k,cnt);
                max=Math.max(max,cnt);
            }
        }
        return a+max;
    }
}