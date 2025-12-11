class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] ans=new int[r][c];
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(n*m==r*c){
                    ans[left][right]=mat[i][j];
                    right++;
                    if(right==c){
                        right=0;
                        left++;                    }
                }
                else {
                    return mat;
                }
            }
        }
    
       return ans;
        
    }
}