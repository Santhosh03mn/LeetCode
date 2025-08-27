class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int tsum=0;
        int sum1=0;
        for(int i=0;i<distance.length;i++){
            tsum+=distance[i];
        }
        if(start<destination){
        for(int i=start;i<destination;i++){
             sum1=sum1+distance[i];
        }
       }
       else{
        for(int i=destination;i<start;i++){
           sum1=sum1+distance[i];
        }
       }
        int ans=tsum-sum1;
        return Math.min(sum1,ans);
    }
}