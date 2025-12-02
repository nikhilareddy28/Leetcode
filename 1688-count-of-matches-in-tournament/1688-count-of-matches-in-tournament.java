class Solution {
    public int numberOfMatches(int n) {
        int teams;
        int matches;
        
        int sum=0;
        while(n>1){
            if(n%2==0){
                matches=n/2;
                teams=n/2;
            }
            else{
                matches=(n-1)/2;
                teams=((n-1)/2)+1;
            }
            n=teams;
            sum+=matches;
        }
        return sum;
    }
}