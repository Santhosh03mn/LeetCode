class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        char last=s.charAt(0);
        sb.append(last);
        int count=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==last){
                count++;
                if(count<3) sb.append(ch);
            }
            else{
                last=ch;
                count=1;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}