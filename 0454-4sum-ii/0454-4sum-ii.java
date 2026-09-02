class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length;
        Map<Integer,Integer> m1=new HashMap<>();
        int cnt=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

            int sum=nums1[i];
            sum+=nums2[j];
            m1.put(sum,m1.getOrDefault(sum,0)+1);

            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

            int sum=nums3[i];
            sum+=nums4[j];
            cnt+=m1.getOrDefault(-sum,0);
            }
        }
        return cnt;
    }
}