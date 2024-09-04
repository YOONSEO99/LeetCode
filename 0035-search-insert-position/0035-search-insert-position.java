class Solution {
    public int searchInsert(int[] nums, int target) {
        // 0. 이미 정렬되어 있는 배열이기 때문에 버블정렬을 이용해서 target 위치 찾기 - 이분 탐색
        // 1. 이분탐색 - 시작점, 중앙값, 끝점 
        int start=0, end=nums.length-1, mid=0;
        
        while(start<=end){
            // 2. 중앙값을 매번 갱신해주기 
            mid = (start+end)/2;
            if(nums[mid]<target){
                // 3. mid가 작은 경우, 시작점을 mid보다 크게 만들기
                start = mid+1;
            }else if(nums[mid]>target){
                // 4. mid가 큰 경우, 끝점을 mid보다 작게 만들기
                end = mid-1;
            }else{
                // 5. 일치하는 경우
                return mid;
            }
        }
        
        return start;
    }
}