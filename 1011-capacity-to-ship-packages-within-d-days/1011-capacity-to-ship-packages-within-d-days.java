class Solution {
    boolean isPossible(int[] arr,long mid,long k){
        long n=arr.length;
        long countDays=1;
        long sum=0;
        for(int i=0; i<n; i++){
            if(sum+arr[i]>mid){
                sum=0;
                countDays++;
                
            }
            sum+=arr[i];
        }
        if(countDays<=k){
            return true;
         }
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        long sum=0;
        long max=Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum+=weights[i];
            max=Math.max(weights[i],max);
        }
        long l=max;
        long h=sum;
        long ans=0;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(isPossible(weights,mid,days)){
                h=mid-1;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return (int)ans;
    }
}