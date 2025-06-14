class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        String t = s;
        int pos = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='9')
            {
                pos=i;
                break;
            }
        }
        if (pos< s.length()) {
            s = s.replace(s.charAt(pos), '9');
        }
        t = t.replace(t.charAt(0), '0');
        return Integer.parseInt(s) - Integer.parseInt(t);
    }
}