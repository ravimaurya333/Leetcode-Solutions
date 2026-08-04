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
        int[] arr=new int[max+1];
        for(int i=0; i<n; i++){
            arr[nums[i]]++;
        }
        for(int i=min; i<=max; i++){
            if(arr[i]==0){
                ls.add(i);
            }
        }
        return ls;
    }
}