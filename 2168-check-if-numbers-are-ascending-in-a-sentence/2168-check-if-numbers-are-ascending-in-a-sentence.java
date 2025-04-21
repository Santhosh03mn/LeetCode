class Solution {
    public boolean areNumbersAscending(String s) {
         String[] list  = s.split(" ");
        int pre = 0;
        for (String i : list){
            if(Character.isDigit(i.charAt(0))){
                int a = Integer.parseInt(i);
                if(pre>=a){
                    return false;
                }else{
                    pre = a;
                }
            }
        }
        return true;
    }
}