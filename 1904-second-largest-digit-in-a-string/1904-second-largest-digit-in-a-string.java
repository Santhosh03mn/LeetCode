class Solution {
    public int secondHighest(String s) {
        int a = -1;
        int b = -1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int x = Character.getNumericValue(c);
                if(x > a){
                    b = a;
                    a = x;
                }else if(x != a && x > b){  
                    b = x;
                }
            }
        }
        return b;
    }
}