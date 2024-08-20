class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else {
            String or = Integer.toString(x);
            StringBuffer str = new StringBuffer(or).reverse();
            String re = str.toString();
            if(or.equals(re)){
                return true;
            }return false;
        }
    }
}