class Solution {
    public int majorityElement(int[] nums) {
        int max_cnt =0 ;
        int max_cnt_ele=nums[0];
        for(int i=0;i<nums.length;i++){
            int curr_ele = nums[i];
            int cnt =1;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]==curr_ele){
                    cnt ++;
                }
                if(cnt>max_cnt){
                    max_cnt = cnt;
                    max_cnt_ele = curr_ele;

                }
            }
            
        }
        return max_cnt_ele;
    }
}