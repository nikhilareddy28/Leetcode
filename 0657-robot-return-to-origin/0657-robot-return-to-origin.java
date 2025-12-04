class Solution {
    public boolean judgeCircle(String moves) {
        int c=0,c1=0,c2=0,c3=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                c++;
            }
             if(moves.charAt(i)=='R'){
                c2++;
            }
             if(moves.charAt(i)=='D'){
                c1++;
            }
             if(moves.charAt(i)=='L'){
                c3++;
            }
        }
        if(c==c1 && c2==c3){
            return true;
        }
        return false;
    }
}