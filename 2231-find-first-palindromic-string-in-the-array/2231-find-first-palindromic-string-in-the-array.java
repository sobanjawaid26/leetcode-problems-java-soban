class Solution {
    public static String firstPalindrome(String[] words) {
        for(int i = 0; i< words.length; i++){
            String rev = revereseString(words[i]);
            if(rev.equalsIgnoreCase(words[i]))
                return words[i];
        }
        return "";
    }

    public static String revereseString(String str){
        int n = str.length();
        char []ch = str.toCharArray();
        char temp;

        for (int i=0, j=n-1; i<j; i++,j--){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }
}