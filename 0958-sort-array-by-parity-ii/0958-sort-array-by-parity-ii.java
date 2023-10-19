class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;
        int[] res = new int[nums.length];

        for(int i= 0; i< nums.length; i++){
            if(nums[i] % 2 == 0){
                res[evenIndex] = nums[i];
                evenIndex += 2;
            } else {
                res[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }
        return res;
    }
}