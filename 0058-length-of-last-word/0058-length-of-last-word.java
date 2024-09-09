class Solution {
    public int lengthOfLastWord(String s) {
        // 0. 문장에서 가장 마지막 단어의 길이 반환
        
        String[] sChange = s.split(" ");
        int lo = sChange.length-1;
        String result = sChange[lo];        
        
        return result.length();
    }
}