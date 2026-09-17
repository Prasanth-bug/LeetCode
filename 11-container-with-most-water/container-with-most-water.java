class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int r=height.length-1;
        int max=0;
        while(left<r)
        {
            int w=r-left;
            int h=Math.min(height[left],height[r]);
            int area=w*h;
            if(area>max){
                max=area;
            }
            if(height[left]<height[r]){
                left++;
            }else{
                r--;
            }
        }
        return max;
    }
}