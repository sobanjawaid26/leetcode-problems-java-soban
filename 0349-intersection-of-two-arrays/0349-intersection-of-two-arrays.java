class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet();
        Set<Integer> s2 = new HashSet();
        List<Integer> l = new ArrayList();

        for(int i = 0; i < nums1.length; i++){
            s1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            s2.add(nums2[i]);
        }
        for(int n : s1){
            if(s2.contains(n)){
                l.add(n);
            }
        }
        int i = 0;
        int[] res = new int[l.size()];
        for(int n : l){
            res[i] = n;
            i++;
        }
        return res;
    }
}