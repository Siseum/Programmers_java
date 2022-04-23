import java.util.*;

public class Solution 
{
    public int[] solution(int []arr) 
    {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(arr[0]);
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1] == arr[i])
                continue;
            
            arrList.add(arr[i]);
        }
        
        answer = new int[arrList.size()];
        
        for(int i=0;i<arrList.size();i++)
        {
            answer[i] = arrList.get(i);    
        }
           
        return answer;
    }
}
