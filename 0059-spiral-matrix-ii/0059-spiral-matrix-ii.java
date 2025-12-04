class Solution {
    public int[][] generateMatrix(int n) {
         int[][] mat=new int[n][n];
         int val=1;
       
         
         int left=0,right=n-1,top=0,bottom=n-1;
           while (left <= right && top <= bottom) {
            // top
            for (int i = left; i <= right; i++) {
                mat[top][i]=val++;
            }
            top++;
            // right
            for (int i = top; i <= bottom; i++) {
                mat[i][right]=val++;
            }
            right--;
            // bottom
            if (top <= bottom) { 
                for (int i = right; i >= left; i--) {
                    mat[bottom][i]=val++;
                }
                bottom--;
            }
            // left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left]=val++;
                }
               
              left++;
            }
        }
         
         return mat;
    }
}