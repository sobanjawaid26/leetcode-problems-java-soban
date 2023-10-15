class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for(int i = 0; i< nums.length; i++){
            if(max < nums[i])
                max = nums[i];
        }
        // 5 + 6 + 7 = 5*3 + 0 + 1 + 2 = summation = n(n+1)/2 but starts from 0 so (n-1)n/2
        return max * k + ((k * (k - 1))/2);
    }
}