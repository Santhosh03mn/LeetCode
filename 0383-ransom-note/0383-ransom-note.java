class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        int[]arr=new int[26];
        for(char c : ransomNote.toCharArray()){
            int a=magazine.indexOf(c,arr[c-'a']);
            if(a==-1) return false;
            arr[c-'a']=a+1;
        }
        return true;
    }
}