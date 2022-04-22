import java.util.*;

public class Solution 
{
    public int solution(int n) 
    {
        int answer = 0;
        
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        
        for(String tStr : strArr)
        {
        	answer += Integer.parseInt(tStr);
        }
        
        return answer;
    }
}
