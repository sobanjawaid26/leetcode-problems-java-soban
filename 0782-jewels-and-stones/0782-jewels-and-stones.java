class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        for(char c1 : jewels.toCharArray()){
            for(char c2 : stones.toCharArray()){
                if(c1 == c2)
                    c++;
            }
        }
        return c;
    }
}