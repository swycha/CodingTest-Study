class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
      int answer = 0;
        int[] student = new int[n + 1];

        for(int i = 1; i <= n; i++){
            student[i] = 1;
        }
        for(int i = 0; i < reserve.length; i++){
            student[reserve[i]] += 1;
        }
        for(int i = 0; i < lost.length; i++){
            student[lost[i]] -= 1;
        }

   
        for(int i = 1; i <= n; i++){
            if(student[i] > 1){
                if(i - 1 > 0 && student[i - 1] < 1){
                    student[i] -= 1; // 하나 주고
                    student[i - 1] += 1;
                    //i++;
                }else if(i < n && student[i + 1] < 1){
                    student[i] -= 1;
                    student[i + 1] += 1;
                    //i++;
                }
            }

        }


        for(int i = 1; i <= n; i++){
         
            if(student[i] >= 1)
                answer++;
        }
        return answer;
    }
}
