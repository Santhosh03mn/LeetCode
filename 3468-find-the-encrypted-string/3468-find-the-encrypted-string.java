class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        String a=s+s;
        return a.substring((k%n),(k%n)+n);
    }
}