class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList();
        for(int i = 0; i< nums.length; i++){
            l.add(nums[i]);
        }
        for(int i = l.size() - 1; i >=0; i--){
            if(l.contains(-1 * l.get(i)))
                return l.get(i);
        }
        return -1;
    }
}