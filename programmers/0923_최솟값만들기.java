import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;
        Arrays.sort(A); // 오름차순
        Arrays.sort(B);
        //Arrays.sort(B, Comparator.reverseOrder()); // Integer만 가능
        
        
        for(int i = 0; i < length; i++){
            answer += A[i] * B[length - 1 - i];
        }
        
        return answer;
    }
}
