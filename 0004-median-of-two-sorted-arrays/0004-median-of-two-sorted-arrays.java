class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1==0 & n2==0) return 0;
        int n=n1+n2;
        int left=0;
        int right=0;
        int i=0;
        int[] ans=new int[n];
        while(left<n1 && right<n2){
            if(nums1[left]<nums2[right]){
                ans[i]=nums1[left];
                i++;
                left++;
            }
            else{
                ans[i]=nums2[right];
                i++;
                right++;
            }
        }
        while(left<n1){
            ans[i++]=nums1[left++];
        }
        while(right<n2){
            ans[i++]=nums2[right++];
        }
        if(n%2!=0){
            return (ans[n/2]);
        }
       
        return (ans[n/2]+ans[n/2-1])/2.0;
    }
}