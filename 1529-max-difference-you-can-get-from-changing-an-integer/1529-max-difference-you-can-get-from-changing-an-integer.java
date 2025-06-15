class Solution {
    public int maxDiff(int num) {
        String s=Integer.toString(num);
        char max=' ';
        for(char ch : s.toCharArray()){
            if(ch!='9'){
                max=ch;
                break;
            }
        }
        String maxStr=s.replace(max,'9');
        String min=s;
        if(s.charAt(0)!='1'){
            min=s.replace(s.charAt(0),'1');
        }
        else{
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c!='0'&&c!='1'){
                    min=s.replace(c,'0');
                    break;
                }
            }
        }
        return Integer.parseInt(maxStr)-Integer.parseInt(min);
    }
}