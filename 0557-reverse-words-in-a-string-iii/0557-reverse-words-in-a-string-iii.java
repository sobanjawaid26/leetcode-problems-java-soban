class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] arr = s.split(" ");
        for(String str : arr){
            StringBuilder sb1 = new StringBuilder(str);
            res.append(sb1.reverse());
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}