class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList();
        for(String word:words){
                if(isCheck(word,pattern)){
                list.add(word);
            }
        }
        return list;
    }
    public boolean isCheck(String word,String pattern){
        for(int i=0;i<word.length();i++){
            if(pattern.indexOf(pattern.charAt(i))!=word.indexOf(word.charAt(i))){
                return false;
            }
        }        
        return true;
    }
}