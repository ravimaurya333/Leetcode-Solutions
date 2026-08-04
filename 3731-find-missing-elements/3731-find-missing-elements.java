class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=min; i<=max; i++){
            boolean contains=true;
            for(int j=0; j<n; j++){
                if(i==nums[j]) {
                    contains=false;
                    break;
                }
            }
            if(contains==true) ls.add(i);
        }
        return ls;
    }
}