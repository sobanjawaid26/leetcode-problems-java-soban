class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int concatVal = 0;
        long res = 0;

        while(nums.length > 1){
            String s1 = Integer.toString(nums[0]); 
            String s2 = Integer.toString(nums[nums.length - 1]); 
            String s = s1 + s2;  
            int c = Integer.parseInt(s); 
            concatVal = c;
            res = res + concatVal;
            nums = removeFirstLast(nums);
        }
        if(nums.length == 1)
            res += nums[0];
        return res;
    }

    public static int[] removeFirstLast(int[] arr){
        int[] r = new int[arr.length - 2];
        for(int i = 1; i < arr.length - 1; i++){
            r[i - 1] = arr[i];
        }
        return r;

    }
}