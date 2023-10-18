class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        StringBuilder res = new StringBuilder();
        int index1 = 0;
        int index2 = 0;

        while(index1 < arr1.length && index2 < arr2.length){
            res.append(arr1[index1]);
            res.append(arr2[index2]);
            index1++;
            index2++;        

        }
        while(index1 < arr1.length){
            res.append(arr1[index1]);
            index1++;
        }
        while(index2 < arr2.length){
            res.append(arr2[index2]);
            index2++;
        }
        return res.toString();
    }
}