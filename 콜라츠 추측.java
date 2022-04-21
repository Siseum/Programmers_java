class Solution 
{
    public int solution(int num) 
    {
        int answer = 0;
        long tempt = num;
        
        while(tempt != 1 && answer <= 500)
        {
            if(tempt % 2 ==0)
                tempt = tempt / 2;
            else
                tempt = tempt * 3 +1;
            
            answer++;
        }
        
        if(answer >500)
            answer = -1;
        
        return answer;
    }
}
 
