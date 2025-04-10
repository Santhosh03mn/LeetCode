class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            char ch=words[i].charAt(0);
            char d=words[i].charAt(words[i].length()-1);
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')){
                count++;
            }
        }
        return count;
    }
}