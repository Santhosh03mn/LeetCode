class Solution {
    public int minOperations(String[] logs) {
        Stack<String>st=new Stack<>();
        String a="../";
        String b="./";
        for(String s:logs){
            if(s.equals(a)&&!st.isEmpty()) 
            st.pop();
            else if(!s.equals(a)&&!s.equals(b))
            st.push(s);
        }
        return st.size();
    }
}