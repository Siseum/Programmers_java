import java.util.*;

class Solution 
{
    public String solution(String s, int n) 
    {
        StringBuffer sb = new StringBuffer(s);
        String answer = "";
        
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i) == ' ')
                continue;
            
            char tChar = sb.charAt(i);
            
            if(tChar>='a' && tChar<='z')
            {
                tChar += n;
                if(tChar > 'z')
                    tChar -= 26;
            }
            
            else if(tChar >= 'A' && tChar <= 'Z')
            {
                tChar += n;
                if(tChar > 'Z')
                    tChar -= 26;
            }
            
            sb.setCharAt(i, tChar);
        }
          
        answer = sb.toString();
        return answer;
    }
}
