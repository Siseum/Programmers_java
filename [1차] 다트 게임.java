import java.util.*;

class Solution 
{
    public int solution(String dartResult) 
    {
        int answer = 0;
        
        int index = 0;
        int firstScore=0;
        int secondScore=0;
        int thirdScore =0;
        
        int temptScore = 0;
        
        
        for(int i=0;i<dartResult.length();i++)
        {
            char dartChar = dartResult.charAt(i);
            
            if(dartChar == 'S' || dartChar == 'D' || dartChar == 'T')
            {
                if(i-2>=0 && dartResult.charAt(i-1) =='0' && dartResult.charAt(i-2) =='1')
                    temptScore = 10;
                else
                    temptScore = Character.getNumericValue(dartResult.charAt(i-1));
            }
            
            if(index == 0)
            {
            	if(dartChar == 'S')
            	{
            		firstScore += temptScore;
            		index++;
            		continue;
            	}
            	else if(dartChar =='D')
            	{
            		firstScore += (int)Math.pow(temptScore,2);
            		index++;
            		continue;
            	}
            	else if(dartChar =='T')
            	{
            		firstScore += (int)Math.pow(temptScore,3);
            		index++;
            		continue;
            	}	
            }
            
            else if(index == 1)
            {
            	if(dartChar == 'S')
            	{
            		secondScore += temptScore;
            		index++;
            		continue;
            	}
            	else if(dartChar =='D')
            	{
            		secondScore += (int)Math.pow(temptScore,2);
            		index++;
            		continue;
            	}
            	else if(dartChar =='T')
            	{
            		secondScore += (int)Math.pow(temptScore,3);
            		index++;
            		continue;
            	}
            }
            
            else if(index == 2)
            {
            	if(dartChar == 'S')
            	{
            		thirdScore += temptScore;
            		index++;
            		continue;
            	}
            	else if(dartChar =='D')
            	{
            		thirdScore += (int)Math.pow(temptScore,2);
            		index++;
            		continue;
            	}
            	else if(dartChar =='T')
            	{
            		thirdScore += (int)Math.pow(temptScore,3);
            		index++;
            		continue;
            	}
            }
            

            if(dartChar =='#')
            {
            	if(index == 1)
            		firstScore = (-1) * firstScore;
            	else if(index == 2)
            		secondScore = (-1) * secondScore;
            	else if(index == 3)
            		thirdScore = (-1)* thirdScore;
            }
            else if(dartChar == '*')
            {
            	if(index == 1)
            		firstScore = firstScore * 2;
            	else if(index == 2)
            	{
            		firstScore = firstScore * 2;
            		secondScore = secondScore * 2;
            	}
            	else if(index == 3)
            	{
            		secondScore = secondScore * 2;
            		thirdScore = thirdScore * 2;
            	}	
            }
        }
                
        answer = firstScore + secondScore + thirdScore;
        return answer;
    }
}
