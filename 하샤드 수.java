class Solution 
{
    public boolean solution(int x) 
    {
        boolean answer = true;
        
        int div = 0;
        int tempt = x;
        
        while(tempt != 0)
        {
            div += (tempt % 10);
            tempt /= 10;
        }
        
        if(x % div != 0)
        {
            answer = false;
        }
        
        return answer;
    }
}
