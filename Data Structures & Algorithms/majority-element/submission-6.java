class Solution {
    public int majorityElement(int[] nums) {
        int cnt =0;
        int curr_element = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt ==0){
                curr_element = nums[i];
            }
            if(nums[i]==curr_element){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return curr_element;
        
    }
}