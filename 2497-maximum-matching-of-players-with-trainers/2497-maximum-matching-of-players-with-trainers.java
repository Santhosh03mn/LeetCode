class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        for(int i=players.length-1,j=trainers.length-1;i>=0&&j>=0;){
            if(players[i]>trainers[j]){
                i--;
            }
            else{
                count++;
                i--;
                j--;
            }
        }
        return count;
    }
}