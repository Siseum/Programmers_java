class Solution 
{
    public String solution(String s) 
    {
        String answer;
        StringBuffer sb = new StringBuffer(s);
        
        int index=0;
        
        for(int i=0;i<sb.length();i++)
        {
        	if(sb.charAt(i) == ' ')
        	{
        		index = 0;
        		continue;
        	}
        	
        	if(index % 2 == 0)
        	{
        		char tChar = sb.charAt(i);
        		tChar = Character.toUpperCase(tChar);
        		sb.setCharAt(i, tChar);
        	}
            else
            {
                char tChar = sb.charAt(i);
                tChar = Character.toLowerCase(tChar);
                sb.setCharAt(i, tChar);
            }
                
        	index++;
        }
        
        answer = sb.toString();
        return answer;
    }
}
