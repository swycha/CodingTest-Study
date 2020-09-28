class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] today = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = 0;

        for(int i = 1; i < a; i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day += 30;
                    break;
                case 2:
                    day += 29;
                    break;
            }
        }
        day += b;

        answer = today[day % 7] ;

        return answer;
    }
}

//int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
//이렇게 해서 구현할 수도 있다.
