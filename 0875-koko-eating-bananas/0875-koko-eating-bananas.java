class Solution {
    public int get_hours(int [] arr,int per_hour){
        int total_time=0;
        for(int i=0; i<arr.length; i++){
            total_time+=Math.ceil((double)arr[i]/(double)per_hour);

        }
        return total_time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(piles[i]>max) max=piles[i];
        }
        int l=1,r=max;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            int min_hour=get_hours(piles,mid);
            if(min_hour<=h){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}