class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        String[]s=new String[score.length];
        for(int i=score.length-1;i>=0;i--){
            int a=score.length-i;
            if(a==1){
                s[map.get(score[i])]="Gold Medal";
            }
            else if(a==2){
                s[map.get(score[i])]="Silver Medal";
            }
            else if(a==3){
                s[map.get(score[i])]="Bronze Medal";
            }
            else{
                s[map.get(score[i])]=String.valueOf(a);
            }
        }
        return s;
    }
}