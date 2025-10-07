class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap <Integer,Integer> resu=new HashMap<>();
        for(int num:nums){
            resu.put(num,resu.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int n:nums){
            res.add(n);
        }
        Collections.sort(res,Collections.reverseOrder());
        Collections.sort(res, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return resu.get(a)-resu.get(b);
            }
        });
        int[] ans= new int[res.size()];
          for (int i = 0; i < res.size(); i++) {
              ans[i] = res.get(i);
        }
        return ans;

        
           
    }
}