class Solution {
    public boolean divisorGame(int n) {
        if(n%2==0){
          int odd = n-1;
          return true;
        }
        return false;
    }
}