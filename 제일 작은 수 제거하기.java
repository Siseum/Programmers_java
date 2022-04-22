import java.util.ArrayList;

class Solution 
{
    public int[] solution(int[] arr) 
    {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
        int[] answer;
        int min = arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i] == min)
        		continue;
        	arrList.add(arr[i]);
        }
    
        if(arrList.size() != 0)
        {
            answer  = new int[arrList.size()];
       
            for(int i=0;i< answer.length;i++)
            {
    	        answer[i] = arrList.get(i);
            }
        }
        else
        {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}
