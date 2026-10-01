class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> fmap = new HashMap<>();
        for(int n:nums){
            if(fmap.containsKey(n) && fmap.get(n)>=1)
            return true;
            fmap.put(n, fmap.getOrDefault(n,0)+1);
        }
        return false;
    }
}