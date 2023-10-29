class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int highest = 0;
        for(int i = 0; i < gain.length; i++){
            curr += gain[i];
            if(curr > highest)
                highest = curr;
        }
        return highest;
    }
}