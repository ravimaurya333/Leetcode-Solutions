class Solution {
    boolean isPossible(int[] arr,int mid,int m,int k){
        int n=arr.length;
        int bqtCnt=0;
        int cnt=0;
        for(int i=0; i<n; i++){
            if(mid>=arr[i]){
                cnt++;
            }
            else{
                cnt=0;
            }
            if(cnt==k){
                cnt=0;
                bqtCnt++;
            }
            if(bqtCnt==m) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int ans=-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isPossible(bloomDay,mid,m,k)){
                max=mid-1;
                ans=mid;
            }
            else{
                min=mid+1;
            }
        }

        return ans;
    }
}