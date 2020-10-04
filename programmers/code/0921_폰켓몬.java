import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int N = nums.length; //고를 수 있는 마릿 수 N/2
        Map<Integer, Integer> kind = new HashMap<>(); //종류와 마릿수
        int val = 0; // for kind map
        
        for(int n : nums){
            if(kind.get(n) == null)
                kind.put(n, 1);
            else{
                val = kind.get(n) + 1;
                kind.put(n, val);
            }
        }
        
        if(N/2 <= kind.size()){
            answer = N/2;
        }else{
            answer = kind.size();
        }
        
        
        return answer;
    }
}
