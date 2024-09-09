class Solution {
    public int lengthOfLastWord(String s) {
        // 0. 문자열 s에서 마지막 단어의 길이 반환
        
        // 1. 공백을 기준으로 문자열 분리
        String[] sChange = s.split(" ");
        int lo = sChange.length-1;
        String result = sChange[lo];        
        
        return result.length();
    }
}