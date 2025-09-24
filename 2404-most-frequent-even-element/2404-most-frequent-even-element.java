class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            if(num%2==0){
            freq.put(num,freq.getOrDefault(num,0)+1);
          }
        }
        int maxf=0;
        for(int f:freq.values()){
            if(f > maxf){
                maxf=f;
            }
        }
        int min=-1;
        for(int fr:freq.keySet()){
            if(freq.get(fr)== maxf){
                if(min==-1 || fr < min){
                   min=fr;
                } 
            }
        }
        return min;
        
    }
}