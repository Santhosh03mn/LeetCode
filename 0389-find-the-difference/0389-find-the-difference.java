class Solution {
    public char findTheDifference(String s, String t) {
      int sum=0;
      for(char ch : s.toCharArray()){
        sum-=ch;
      }
      for(char ch1 : t.toCharArray()){
        sum+=ch1;
      }
      return (char) sum;
    }
}