class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        //Binary saerch template
        int left = 0;
        int right = m * n - 1; // -1 since 0 indexed

        while(left <= right){
            
            int mid = left + (right - left) / 2;
            // to get an exact value from a 2D array we need the row and the column both

            int val = matrix[mid / n][mid % n];

            if(val == target){
                return true;
            }else if(val < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        } 
        return false;
    }
}
