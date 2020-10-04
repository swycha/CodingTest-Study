import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        
        for(int i = 0; i < arr.length - 4; i++){
            arr[i] = '*';
        }
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        
        return answer;
    }
}
