class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i<nums.length; i++){
            int currAns = getMax(nums[i]);
            if(map.containsKey(currAns)){
                if(nums[i] + map.get(currAns) > ans)
                    ans = nums[i] + map.get(currAns);
                if(nums[i] > map.get(currAns))
                    map.put(currAns, nums[i]);
            } else {
                map.put(currAns, nums[i]);
            }
        }
        return ans;
    }

    public static int getMax(int num){
        int maxDigit = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            if(maxDigit < lastDigit)
                maxDigit = lastDigit;
        }
        return maxDigit;
    }

}