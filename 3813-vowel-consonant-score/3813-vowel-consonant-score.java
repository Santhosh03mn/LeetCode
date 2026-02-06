class Solution {
    public int vowelConsonantScore(String s) {
        int vowel=0;
        int consonant=0;
        for(char ch: s.toCharArray()){
            if(ch>='a'&&ch<='z'){
                if(isVowel(ch)){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        if(consonant==0){
            return 0;
        }
        return vowel/consonant;
    }
    private boolean isVowel(char ch){
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}