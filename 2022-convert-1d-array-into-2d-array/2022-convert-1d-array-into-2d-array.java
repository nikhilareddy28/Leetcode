class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        int a = 0;
        if((m*n)!=original.length){
            int[][] A=new int[0][0];
            return A;
        }
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                int val = original[a++];
                res[i][k] = val;
            }
          }
    
        
           return res;

    }
}