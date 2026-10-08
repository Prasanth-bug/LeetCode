class Solution {
    public String removeOuterParentheses(String s) {
        int bal =0;
        int n  = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
          if(s.charAt(i)=='('){
            if(bal>0){
               ans.append('(');
            }
            bal++;
          }
          else{
          bal--;
          if(bal>0){
            ans.append(')');
          }
          }
        }
        return ans.toString();
    }
}