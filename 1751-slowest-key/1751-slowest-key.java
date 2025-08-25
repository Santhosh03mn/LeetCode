class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char c=keysPressed.charAt(0);
        int max=releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            int a=Math.abs(releaseTimes[i-1]-releaseTimes[i]);
            if(a>max||(a==max&&keysPressed.charAt(i)>c)){
                max=a;
                c=keysPressed.charAt(i);
            }
        }
        return c;
    }
}