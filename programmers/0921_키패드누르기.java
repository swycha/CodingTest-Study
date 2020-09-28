class Solution {
    
    int distance(int n1, int n2){
        //절댓값
        int x1, y1, x2, y2 = 0;
        int result = 0;
        
        switch(n1){
            case 0:
                x1 = 3;
                y1 = 1;
                break;
            case -1:
                x1 = 3;
                y1 = 0;
                break;
            case -2:
                x1 = 3;
                y1 = 2;
                break;
            default:
                x1 = (n1 - 1) / 3;
                y1 = (n1 - 1) % 3;
                break;
        }
        
        switch(n2){
            case 0:
                x2 = 3;
                y2 = 1;
                break;
            case -1:
                x2 = 3;
                y2 = 0;
                break;
            case -2:
                x2 = 3;
                y2 = 2;
                break;
            default:
                x2 = (n2 - 1) / 3;
                y2 = (n2 - 1) % 3;
                break;
        }
        
        result = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return result;
        // x,y좌표 각각 빼서 더해주면 그게 거리네!
       
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lnow = -1; //왼쪽 엄지 현재 위치.
        int rnow = -2; //오른쪽 엄지 현재 위치.
        int lDistance = 0;
        int rDistance = 0;
        for(int n : numbers){
            switch(n){
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    lnow = n;
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    rnow = n;
                    break;
                case 2:
                case 5:
                case 8:
                case 0:
                    lDistance = distance(n, lnow);
                    rDistance = distance(n, rnow);
                    if(lDistance == rDistance){
                        if(hand.equals("right")){
                            answer += "R";
                            rnow = n;
                            break;
                        }else{
                            answer += "L";
                            lnow = n;
                            break;
                        }
                    }else if(lDistance > rDistance){
                        answer += "R";
                        rnow = n;
                        break;
                    }else {
                        answer += "L";
                        lnow = n;
                        break;
                    }
            }
            //System.out.println(n);
            //System.out.println(answer);
            
        }
        
        return answer;
    }
}
