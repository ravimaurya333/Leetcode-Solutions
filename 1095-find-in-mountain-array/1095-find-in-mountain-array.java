/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    int findPeak(MountainArray mountainArr,int l,int r){
        while(l<r){
            int mid=l+(r-l)/2;
            int mValue=mountainArr.get(mid);
            
            if(mValue<mountainArr.get(mid+1)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
    int searchLeftArray(MountainArray mountainArr,int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            int mValue=mountainArr.get(mid);
            if(mValue==target) return mid;
            if(mValue<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }

    int searchRightArray(MountainArray mountainArr,int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            int mValue=mountainArr.get(mid);
            if(mValue==target) return mid;
            if(mValue<target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }


    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n= mountainArr.length();
        
        int peak=findPeak(mountainArr,0,n-1);
        int ans=searchLeftArray(mountainArr,0,peak,target);
        if(ans!=-1){
            return ans;
        }
        ans=searchRightArray(mountainArr,peak+1,n-1,target);
        if(ans!=-1){
            return ans;
        }
        return -1;
    }
}