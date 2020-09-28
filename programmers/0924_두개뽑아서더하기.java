import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
            int[] answer = {};
        //ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                map.put(numbers[i] + numbers[j], 1);
            }
        }

        answer = new int[map.size()];
        int i = 0;
        for(Integer key : map.keySet()){
            answer[i] = key;
            i++;
        }

        Arrays.sort(answer);
        return answer;
    }
}
