class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
      int n=nums.length/2;
        for(int f:nums){
            res.put(f,res.getOrDefault(f,0)+1);
        }
        for(int i:res.keySet()){
           if(res.get(i)==n){
            return i;
           }
        }
        return -1;
    }
}