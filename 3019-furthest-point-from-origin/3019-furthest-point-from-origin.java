class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int missingCount = 0;
        char[] arr = moves.toCharArray();
        for(char c : arr){
            if(c == 'L')
                count--;
            else if(c == 'R')
                count++;
            else
                missingCount++;
        }
        return Math.abs(count) + missingCount;
    }
}