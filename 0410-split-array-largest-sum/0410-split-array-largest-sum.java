class Solution {
    boolean isPossible(int[] arr,long mid, long k){
        long n=arr.length;
        long count=1;
        long sum=0;
        for(int i=0; i<n; i++){
            if(arr[i]>mid) return false;
            if(arr[i]+sum>mid){
                count++;
                if(count>k) return false;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        long n=nums.length;
        if(n<k) return -1;
        long left=Long.MIN_VALUE;
        long right=0;
        for(int i=0; i<n; i++){
            right+=nums[i];
            left=Math.max(nums[i],left);
        }
        if(n==k) return (int)left;
        long ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(isPossible(nums,mid,k)){
                right=mid-1;
                ans=mid;
            }
            else{
                left=mid+1;
            }
        }
        return (int)ans;
    }
}