class Solution {
        public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int p=0;
            int s=0;
            while(n>0){
                p=n%10;
                s++;
                n=n/10;
            }
            if(s%2==0){
                c++;
            }
        }
        return c;
    }
}

                               
                         
   
                                                                             
                                                                     
                                                       
                       
 


