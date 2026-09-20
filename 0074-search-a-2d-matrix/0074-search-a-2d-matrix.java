class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int leftrow = 0;
        int rightrow = matrix[0].length-1;
        int left = 0;
        int right = matrix.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[mid][leftrow] <= target && matrix[mid][rightrow] >= target){


                while(leftrow <= rightrow){    
                    int midrow = leftrow + (rightrow - leftrow)/2;
                    if(matrix[mid][midrow] > target){
                        rightrow = midrow - 1;
                    }
                    else if(matrix[mid][midrow] == target){
                        return true;
                    }
                    else leftrow = midrow + 1;
                }
            }
            else if(matrix[mid][leftrow] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
        
    }
}