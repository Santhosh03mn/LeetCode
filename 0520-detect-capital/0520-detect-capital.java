class Solution {
    public boolean detectCapitalUse(String word) {
        int a=0,b=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                a++;
            }
            else if(Character.isLowerCase(word.charAt(i))){
                b++;
            }
        }
        if((a==1&&Character.isUpperCase(word.charAt(0)))||a==word.length()||b==word.length()){
            return true;
        }
        return false;
    }
}