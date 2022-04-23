class Solution 
{
    public String[] solution(int n, int[] arr1, int[] arr2) 
    {
        String[] answer = new String[n];
        StringBuffer[] sbArr = new StringBuffer[n];
        
        for(int i=0;i<n;i++)
        {
        	arr1[i] = arr1[i] | arr2[i];
        }
        
        for(int i=0;i<n;i++)
        {
        	StringBuffer sb = new StringBuffer();
        	int temptNum = arr1[i];
            int count = 0;
        	while(count < n)
        	{
        		if(temptNum % 2 ==0)
        			sb.append(' ');
        		else
        			sb.append('#');
        		
        		temptNum = temptNum / 2;
                count++;
        	}
        	
        	sb.reverse();
        	sbArr[i] = sb;
        }
        
        for(int i=0;i<n;i++)
        {
        	answer[i] = sbArr[i].toString();
        }
        
        return answer;
    }
}
