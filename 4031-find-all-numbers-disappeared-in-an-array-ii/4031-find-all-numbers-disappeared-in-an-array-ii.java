class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ls=new ArrayList<>();
        
        int lwr=lower;
        for(int i=0; i<n; i++){
            List<Integer> temp=new ArrayList<>();
            //missing found
            if(nums[i]<lwr) continue;
            if(nums[i]-lwr>0 && nums[i]<=upper){
                temp.add(lwr);
                temp.add(nums[i]-1);
                ls.add(temp);
                lwr=nums[i]+1;
            }
            
            //same number
            else if(nums[i]-lwr==0){
                lwr=nums[i]+1;
            }
            if(lwr>upper) break;
        }
        if(lwr<=upper){
            List<Integer> temp=new ArrayList<>();
            temp.add(lwr);
            temp.add(upper);
            ls.add(temp);
        }
        return ls;
    }
}