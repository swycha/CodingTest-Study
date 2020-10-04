class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        //ArrayList<Integer> score = new ArrayList<>(); // 연산때문에..
        char[] dart = dartResult.toCharArray();
        
        int cnt = -1;
        for(int i = 0; i < dart.length; i++){
            if(Character.isDigit(dart[i])){
                cnt++;//bound 때문에
                if(dart[i + 1] == '0'){
                    score[cnt] = 10;
                    i++;
                }else
                    score[cnt] = dart[i] - '0';
            }else if(dart[i] == 'D'){
                score[cnt] *= score[cnt];
            }else if(dart[i] == 'T'){
                score[cnt] *= score[cnt] * score[cnt];
            }else if(dart[i] == '*'){
                if(cnt == 0)
                    score[cnt] *= 2;
                else{
                    score[cnt] *= 2;
                    score[cnt - 1] *= 2;
                }
            }else if(dart[i] == '#'){
                score[cnt] *= -1;
            }
        }
        
        
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}
