class Solution {
    boolean isPossible(int[] arr,long mid,long m){
        int n=arr.length;
        int count=1;
        int x=arr[0];
        for(int i=1; i<n; i++){
            int dis=arr[i]-x;
            if(dis>=mid){
                count++;
                x=arr[i];
            }
            if(count==m) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        long low=1;
        long high=position[n-1]-position[0];
        long minDistance=1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isPossible(position,mid,m)){
                low=mid+1;
                minDistance=mid;
            }
            else{
                high=mid-1;
            }
        }
        return (int)minDistance;
    }
}