class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList();
        List<Integer> odd = new ArrayList();
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        for(int n : odd){
            even.add(n);
        }
        int i = 0;
        for(int n : even){
            res[i] = n;
            i++;
        }
        return res;
    }
    
}