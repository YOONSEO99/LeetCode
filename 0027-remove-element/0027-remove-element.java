class Solution {
    public int removeElement(int[] nums, int val) {
        //Array는 고정크기라서 인덱승의 요소를 제거하는 메소드를 제공하지 않음 
        //ArrayList는 Array와 다르게 크기 변경 가능 / int, long등 기본 데이터 유형은 사용불가
        
        // 0.새로운 List 만들어서 val을 제외한 요소들만 저장하고 다시 nums에 저장
        ArrayList<Integer> result = new ArrayList<>();
        
        // 1. 향상된 for문(for each문)
        for(int now : nums){
            if(now == val){
                // 1-1. continue는 해당 부분을 실행하지 않고 그 다음부터 반복 실행하므로 
                // val과 동일한 숫자가 나오면 pass하고 그다음 숫자로 넘어감
                continue;
            }
            result.add(now);
        }
        
        // 2. val을 제외하고 담았던 ArrayList를 다시 nums에 넣기
        for(int i=0; i<result.size();i++){
            nums[i]=result.get(i);
        }
        // 3. val과 같지 않은 숫자의 갯수 k 반환
        return result.size();
    }
}