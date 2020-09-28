import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d); // 요것이 핵심
        int sum = 0;
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            if(sum > budget){
                answer = i;
                break;
            }
        }
        if(sum <= budget)
            return d.length;
        
        return answer;
    }
}
