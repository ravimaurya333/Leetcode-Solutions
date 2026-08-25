class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int multi=k;
        for(int i=0; i<n; i++){
            if(nums[i]%k==0){
                if(multi==nums[i]){
                    if(i<n-1 && nums[i]!=nums[i+1]){
                        multi+=k;
                    }
                }
                else{
                    return multi;
                }
            }
        }
        if(multi==nums[n-1]){
            multi+=k;
        }
        return multi;
    }
}