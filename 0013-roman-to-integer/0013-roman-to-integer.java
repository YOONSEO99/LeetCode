class Solution {
    public int romanToInt(String s) {
        // 문자열의 뒤쪽부터 탐색하여 이전 값이 현재 값보다 클 경우 -, 아닌경우 +
        int res=0, now=0, pre=0;
        
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I' : now=1; break;
                case 'V' : now=5; break;
                case 'X' : now=10; break;
                case 'L' : now=50; break;
                case 'C' : now=100; break;
                case 'D' : now=500; break;
                case 'M' : now=1000; break;
            }
            if(now<pre){
                res-=now;
            }else res+=now;
            
            pre = now;   
        }
        return res;
    }
}