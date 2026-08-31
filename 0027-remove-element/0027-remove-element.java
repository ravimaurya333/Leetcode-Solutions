class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1){
            if(nums[0]==val) return 0;
            else return 1;
        }
        int i=0;
        if(i<n && nums[i]!=val){
            i++;
        }
        int j=n-1;
        while(i<=j){
            if(nums[i]==val && nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if(nums[i]!=val){
                i++;
            }
            else{
                j--;
            }
        }
        return i;
    }
}