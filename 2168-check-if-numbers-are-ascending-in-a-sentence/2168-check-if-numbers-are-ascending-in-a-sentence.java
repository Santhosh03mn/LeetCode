class Solution {
    public boolean areNumbersAscending(String s) {
        String[]ans=s.split(" ");
        int prv=-1;
        for(String num : ans){
            if(num.matches("\\d+")){
                int val=Integer.parseInt(num);
                if(val<=prv){
                    return false;
                }
                prv=val;
            }
        }
        return true;
    }
}