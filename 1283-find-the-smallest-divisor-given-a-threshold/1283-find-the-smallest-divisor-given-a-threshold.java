class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int n=nums.length;
        int r=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            r=Math.max(r,nums[i]);
        }
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            long sum=0;
            for(int i=0; i<n; i++){
                sum+=Math.ceil((double)nums[i]/mid);
            }

            if(sum<=threshold){
                r=mid-1;
                ans=mid;
            }
            else{
                    l=mid+1;
            }
        }
        return ans;
    }
}