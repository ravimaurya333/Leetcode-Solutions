class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(piles[i],max);
        }
        int l=1;
        int r=max;
        int ans=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            long totalHours=0;
            for(int i=0; i<n; i++){
                totalHours+=piles[i]/mid;
                totalHours+=(piles[i]%mid)!=0?1:0;
            }
            if(totalHours>h){   
                 l=mid+1;
            }
            else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
}