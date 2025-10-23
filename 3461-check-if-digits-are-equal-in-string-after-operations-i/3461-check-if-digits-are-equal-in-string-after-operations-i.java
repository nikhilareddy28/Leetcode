class Solution {
    public boolean hasSameDigits(String s) {
            while(s.length()>2){
                  String str="";
                for(int i=0;i<s.length()-1;i++){
                   int sum = ((s.charAt(i) - '0') + (s.charAt(i+1) - '0')) % 10;
                      str=str+sum;
                }
               s=str;
            }
             int a = s.charAt(0) - '0';
              int b = s.charAt(1) - '0';
             return a == b;
       
            
        
    }
}