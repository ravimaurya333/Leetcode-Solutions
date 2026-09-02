class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        if(n==1 || k<0) return 0;
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        int cnt=0;
        while(j<n){
              

            if(i>=j){
                j++;
                continue;
            }
            if(Math.abs(nums[i]-nums[j])<k){
                        j++;
            }
           else if(Math.abs(nums[i]-nums[j])==k){
                cnt++;
                i++;
                  while(i<n && nums[i]==nums[i-1]) i++;
            }
            else
             i++;
           
        }
        return cnt;
    }
}