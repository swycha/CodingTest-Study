import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int num;
        //String ans = "";
        
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = arr.length - 1; i >= 0; i--){
            stack.add(arr[i]);
        }
        
        num = stack.pop();
        while(!stack.isEmpty()){
            //num = stack.pop();
            
            if(list.size() == 0)
                list.add(num);
            
            if(num == stack.peek()){
                num = stack.pop();
            }else{
                list.add(stack.peek());
                num = stack.peek();
            }
        }
        answer = new int[list.size()];
        
        //list -> int[]
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
       
        return answer;
    }
}
