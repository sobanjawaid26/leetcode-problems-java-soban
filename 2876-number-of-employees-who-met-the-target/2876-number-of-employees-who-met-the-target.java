class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for(int i = 0; i<=hours.length - 1; i++){
            if(hours[i] >= target)
                res++;
        }
        return res;
    }
}