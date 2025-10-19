class Solution {
    public int getLeastFrequentDigit(int n) {
        ArrayList<Integer> res =new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int leastcount=-1;
        while(n>0)
        {
            int r=n%10;
           freq.put(r,freq.getOrDefault(r,0)+1);
            n=n/10; 
        }
        
        for(int f:freq.keySet()){ 
             int count=freq.get(f);
             if(count<min){
                min=count;
                leastcount=f;
             }
        }
        return leastcount;
        

        
    }
}