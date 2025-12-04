class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int left=capacity;
        int step=0;
       
        for(int i=0;i<plants.length;i++){
            if(left>=plants[i]){
                step++;
                left=left-plants[i];
            }
            else {
                step+=i;
                step+=i+1;
                left=capacity-plants[i];
                }
            }
        
        
        return step;
    }
}