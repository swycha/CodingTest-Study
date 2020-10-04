import java.util.*;
class Solution {
    boolean compare(String s, String t){
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        
        String sHead = getHead(schar);
        String tHead = getHead(tchar);
        
        int sNum = getNum(schar);
        int tNum = getNum(tchar);
       
        sHead = sHead.toLowerCase();
        tHead = tHead.toLowerCase();
        
        if(sHead.equals(tHead)){
            //if(sNum <= tNum)
            if(sNum <= tNum)
                return true;
            else
                return false;
        }else{
            
            //if(sHead <= tHead)
            if(tHead.compareTo(sHead) >= 0)
                return true;
            else
                return false;
        }
        
    }
    String getHead(char[] c){
        String head = "";
        for(int i = 0; i < c.length; i++){
            if(!Character.isDigit(c[i]))
                head += c[i];
            else
                break;
        }
        return head;
    }
    int getNum(char[] c){
        String num = "";
        for(int i = 0; i < c.length; i++){
            if(Character.isDigit(c[i])){
                num += c[i];
                if(i + 1 < c.length && !Character.isDigit(c[i+1]))
                    break;
            }   
        }
        
        int n = Integer.parseInt(num);
        return n;
    }
    public String[] solution(String[] files) {
        String[] answer = {};
        LinkedList<String> list = new LinkedList<>();
        
        for(String file : files){
            if(list.size() == 0){
                list.add(file);
            }else{
                int index = list.size() - 1;
            while(index >= 0){
                if(compare(list.get(index), file) == true){
                    //list[index] <= file
                    list.add(index + 1, file);
                    break;
                }else{
                    if(index == 0){
                        list.add(0, file);
                        break;
                    }else{
                        index--;
                    }
                    
                }
            }    
            }
            
        }
        
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
