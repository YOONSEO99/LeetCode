class Solution {
    public int strStr(String haystack, String needle) {
        // 0. indexOf 메소드를 이용하여 needle이 haystack 앞에서부터 처음 발견되는 인덱스 반환 
        int result = haystack.indexOf(needle);
        return result;
    }
}