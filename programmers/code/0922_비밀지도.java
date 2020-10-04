class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        int[][] totalMap = new int[n][n];
        
        int num = 0;
        
        //-> for arr1, map1
        for(int i = 0; i < n; i++){
            num = arr1[i];
            for(int j = arr1.length - 1; j >= 0; j--){
                map1[i][j] = num % 2;
                num /= 2;
            }
        }
        
        //-> for arr2, map2
        for(int i = 0; i < n; i++){
            num = arr2[i];
            for(int j = arr2.length - 1; j >= 0; j--){
                map2[i][j] = num % 2;
                num /= 2;
            }
        }
        
        //-> 두개 합침
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map1[i][j] == 1 || map2[i][j] == 1)
                    totalMap[i][j] = 1;
                else if(map1[i][j] == 0 && map2[i][j] ==0)
                    totalMap[i][j] = 0;
            }
        }
        
        String line = "";
        answer = new String[n];
        for(int i = 0; i < n; i++){
            line = "";
            for(int j = 0; j < n; j++){
                if(totalMap[i][j] == 1)
                    line += "#";
                else
                    line += " ";
            }
            answer[i] = line;
        }
       
        return answer;
    }
}
