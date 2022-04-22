import java.util.ArrayList;
import java.util.Collections;

class Solution 
{
    public long solution(long n) 
    {
        long answer = 0;
        ArrayList<Long> arrList = new ArrayList<Long>();
        
        while(n !=0)
        {
            arrList.add((n%10));
            n = n / 10;
        }
        
        Collections.sort(arrList,Collections.reverseOrder());
        
        for(Long tempt : arrList)
        {
        	answer = (answer * 10) + tempt;
        }
        
        
        return answer;
    }
}
