class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[]a=Complex(num1);
        int[]b=Complex(num2);
        int aa=a[0]*b[0]-a[1]*b[1];
        int bb=a[0]*b[1]+a[1]*b[0];
        return aa+"+"+bb+"i";
    }
    private int[] Complex(String s){
        int c=s.indexOf('+');
        int a=Integer.parseInt(s.substring(0,c));
        int b=Integer.parseInt(s.substring(c+1,s.length()-1));
        return new int[]{a,b};
    }
}