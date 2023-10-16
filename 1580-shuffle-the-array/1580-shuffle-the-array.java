class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] res = new int[size];
        int i = 0, ind = 0;
        int j = (size / 2);
        while(j < size){
            res[ind] = nums[i];
            res[ind + 1] = nums[j];
            i++;
            j++;
            ind += 2;
        }
        return res;
    }
}