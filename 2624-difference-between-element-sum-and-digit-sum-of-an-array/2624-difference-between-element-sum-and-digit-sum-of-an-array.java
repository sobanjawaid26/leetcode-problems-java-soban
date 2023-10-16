class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for(int i = 0; i< nums.length; i++){
            eleSum += nums[i];
            int n = nums[i];
            while(n > 0){
                int rem = n % 10;
                digitSum += rem;
                n /= 10;
            }
        }
        return Math.abs(eleSum - digitSum);
    }
}