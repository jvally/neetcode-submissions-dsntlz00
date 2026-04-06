class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //since first int of each row is greater than previous row we check
        //all first integers first
        //find the correct row then find the correct column
        int l = 0;
        int r = matrix.length - 1;
        int n = matrix[0].length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(matrix[mid][0] == target){
                return true;
            } else if(matrix[mid][0] < target && target <= matrix[mid][n]){
                int i = 0;
                int j = n;
                while (i <= j){
                    int m = (i + j)/2;
                    if(matrix[mid][m] == target){
                        return true;
                    } else if(matrix[mid][m] < target){
                        i = m + 1;
                    } else{
                        j = m - 1;
                    }
                }
                r = mid - 1;
            } else if(matrix[mid][0] < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
