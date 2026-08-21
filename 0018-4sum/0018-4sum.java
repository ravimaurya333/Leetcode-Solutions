class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n-2; j++){
            if(j>i+1 && nums[j]==nums[j-1]) continue;

                int l=j+1;
                int r=n-1;
                
                while(l<r){
                    long sum=nums[i];
                    sum+=nums[r];
                    sum+=nums[l];
                    sum+=nums[j];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                            ls.add(temp);
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1]) l++;
                        while(l<r && nums[r]==nums[r+1]) r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return ls;
    }
}