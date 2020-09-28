class Solution {
    public int solution(int num) {
        
        int i = 0;
        long number =(long)num;
        while(number != 1 && i <= 500){
            
            if(number % 2 == 0){
                number /= 2;
            }else{
                number *= 3;
                number += 1;
            }
            i++;
        }
        if(i > 500)
            return -1;
        else 
            return i;
       
    }
}
