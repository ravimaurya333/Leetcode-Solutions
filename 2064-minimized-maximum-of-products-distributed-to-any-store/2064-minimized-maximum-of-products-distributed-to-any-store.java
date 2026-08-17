class Solution {
    boolean isPossible(int[] quantities,int n,int mid){
        int size=quantities.length;
        int cnt=0;
        for(int i=0; i<size; i++){
            cnt+=Math.ceil((double)quantities[i]/mid);
            if(cnt>n) return false;
        }
            if(cnt<=n) return true;
        return false;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int size=quantities.length;
        int left=1;
        int right=0;
        for(int i=0; i<size; i++){
            right=Math.max(quantities[i],right);
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(quantities,n,mid)){
                    right=mid-1;
                    ans=mid;
            }
            else{
                left=mid+1;
            }
        }
        return ans;

    }
}