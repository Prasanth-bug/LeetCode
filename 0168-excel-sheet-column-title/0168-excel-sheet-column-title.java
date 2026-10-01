class Solution {
    public String convertToTitle(int n) {
        StringBuilder result= new StringBuilder();
        while(n>0){
            n--;
            int r= n%26;
            result.insert(0,(char)('A'+r));
            n=n/26;
        }
        return result.toString();
    }
}