class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(n==1) return nums[0];
        int total=0;
        for(int i=0; i<n; i++){
            if(total<0) total=0;
            total+=nums[i];
            if(total>max) max=total;
        }
        return max;
    }
}