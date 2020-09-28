import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        Map<Integer, Integer> user = new HashMap<>();
        Map<Integer, Double> fail = new HashMap<>();
        
        int val = 0;
        for(int i = 1; i<= N + 1; i++){
            user.put(i, 0);
        }
        for(int s : stages){
            val = user.get(s) + 1;
            user.put(s, val);
        }
        
        for(int i = 1; i <= N; i++){
            fail.put(i, 0.0);
        }
        
        int chall = 0;
        int clear = 0;
        for(int i = 1; i <=N; i++){
            chall = 0;
            clear = 0;
            for(int j = i; j <= N + 1; j++){
                chall += user.get(j);
            }
            clear = user.get(i);
            
            if(chall == 0)
                fail.put(i, 0.0);
            else
                fail.put(i, clear / (double)chall);
        }
        
        //내림차순
        List<Integer> keySetList = new ArrayList<>(fail.keySet());
        Collections.sort(keySetList, (o1, o2) -> (fail.get(o2).compareTo(fail.get(o1))));
        
        int i = 0;
        answer = new int[N];
        for(Integer key : keySetList){
            answer[i] = key;
            i++;
            
        }
        
        return answer;
    }
}
