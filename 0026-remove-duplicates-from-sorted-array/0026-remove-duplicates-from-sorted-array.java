class Solution {
    public int removeDuplicates(int[] nums) {
        // 0. 문제 이해 : 내림차순 정렬된 배열 nums, 중복되는 값 제거하고 길이 return
        
        // 1. 정렬된 배열이기 때문에 양 옆을 비교해서 값이 같으면 pass, 다르면 count
        // 2. 배열의 길이가 0이면 값이 없는거니까 0 return 
        if(nums.length==0){
            return 0;
        }else{
            // 3. 변수 i를 이용해서 양 옆 비교하고 카운팅
            int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[j]!=nums[i]){
                    // 두 값이 같지 않으면 i 카운팅
                    i++;
                    // 다음 숫자와 비교해야 하므로 nums[i]에 nums[j] 값 대입
                    nums[i] = nums[j];
                }
            }
                // 개수인데 i가 0부터 시작하므로 +1 후 return 
                return i+1;
        }
    }
} 