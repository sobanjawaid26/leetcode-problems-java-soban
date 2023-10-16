class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i< n; i++){
            int j = n - i - 1;
            if(arr[i] != arr[j]){
                arr[j] = arr[i] < arr[j] ? arr[i] : arr[j];
                arr[i] = arr[j];
            }
        }

        return new String(arr);
    }
}