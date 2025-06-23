class Solution {
    public int countSeniors(String[] details) {
        int a=0;
        for(String num : details){
            int age=Integer.parseInt(num.substring(11,13));
            if(age>60)
            a++;
        }
        return a;
    }
}