class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k==0||n>=k-1+maxPts) return 1.0;
        double[]a=new double[n+1];
        a[0]=1.0;
        double b=0.0,sum=1.0;
        for(int i=1;i<=n;i++){
            a[i]=sum/maxPts; 
            if(i<k) sum+=a[i];
            else b+=a[i];
            if(i>=maxPts) sum-=a[i-maxPts];     
        }
        return b;
    }
}