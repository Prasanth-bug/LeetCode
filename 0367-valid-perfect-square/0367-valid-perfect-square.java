import java.util.*;
class Solution {
    public boolean isPerfectSquare(int num) {
       long low = 1;
       long high=  num;
       while(low<=high){
        long mid = (low+high)/2;
        long root = mid*mid;
        if(root==num){
          return true;
        }
        else if(root<num){
          low = mid+1;
        }
        else{
          high=mid-1;
        }
              }
        return false;
            }
}