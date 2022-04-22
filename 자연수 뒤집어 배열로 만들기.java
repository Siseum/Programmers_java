import java.util.ArrayList;
import java.util.Collections;

class Solution 
{
    public int[] solution(long n) 
    {
            int[] answer = {};
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        
	        while(n != 0)
	        {
	            arrList.add((int)(n%10));
	            n = n/10;
	        }
	        
	        answer = new int[arrList.size()];
	        
	        for(int i=0;i<arrList.size();i++)
	        	answer[i] = arrList.get(i);
        
        return answer;
    }
}
