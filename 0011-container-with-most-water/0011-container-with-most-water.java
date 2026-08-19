class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int store=0;
            store=Math.min(height[l],height[r])*(r-l);
            max=Math.max(store,max);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}