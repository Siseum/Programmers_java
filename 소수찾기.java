import java.util.*;

class Solution 
{
    static boolean[] sosu;
    
    public int solution(int n) 
    {
        int answer = 0;
        sosu = new boolean[n+1];
        
        for(int i=2;i<=n;i++)
        {
            if(sosu[i] == true)
                continue;
            for(int j = 2; i*j<=n; j++)
            {
                sosu[i*j] = true;
            }
        }
        
        for(int i=2;i<=n;i++)
        {
            if(sosu[i]==false)
                answer++;
        }
        
        return answer;
    }
}
