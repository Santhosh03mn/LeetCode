class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int num=(int)coordinates.charAt(1)-'0';
        if(a=='a'||a=='c'||a=='e'||a=='g'){
            if(num==1||num==3||num==5||num==7) return false;
            return true;
        }
        if(num==1||num==3||num==5||num==7) return true;
        return false;
    }
}