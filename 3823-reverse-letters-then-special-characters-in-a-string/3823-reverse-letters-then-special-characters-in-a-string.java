class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        char[]ch=new char[n];
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                s1.append(c);
            }
            else{
                s2.append(c);
            }
        }
        int a=s1.length()-1;
        int b=s2.length()-1;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                ch[i]=s1.charAt(a--);
            }
            else{
                ch[i]=s2.charAt(b--);
            }
        }
        return new String(ch);
    }
}