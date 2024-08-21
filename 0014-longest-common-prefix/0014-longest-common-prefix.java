class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. 문자열 배열 정렬하기
        Arrays.sort(strs);
        // 2. 정렬된 문자열 배열에서 첫번째 문자열과 마지막 문자열 비교하기 
        String first = strs[0];
        String last = strs[strs.length-1];
        // 3. index 카운트를 위한 변수 생성 및 초기화
        int c = 0;
        
        // 4. 반복문 while을 이용해서 인덱스 변수가 첫번째 문자열의 길이보다 작을 때 반복
        while(c<first.length()){
            if(first.charAt(c)==last.charAt(c)){
                c++;
            }else{
                break;
            } 
        }
        
        //5. 접두사가 있으면 접두사 반환, 없으면 "" 반환
        String result ="";
        if(c==0){
            return result;
        }else{
            return first.substring(0,c);
        }
        
    }
}