import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        char[] word = s.toCharArray(); 
        Stack<Character> stack = new Stack<>(); //문자열
        
        if(s.length() % 2 == 1)
            return 0;
        
        for(int i = 0; i < word.length; i++){
            if(stack.isEmpty())
                stack.add(word[i]);
            else{
                if(stack.peek() == word[i])
                    stack.pop();
                else
                    stack.add(word[i]);
            }
        }
        
        if(stack.isEmpty())
            return 1;
        else
            return 0;
    
    }
}
