class Solution 
{
    public int[] solution(int n, int m) 
    {
        int[] answer = new int[2];
        
        int gcd = 1;
        int lcm = 0;
        
        if(n>m)
        {
            int tempt = n;
            n = m;
            m = tempt;
        }
        
        for(int i=2; i <=n;i++)
        {
            if(n % i == 0 && m % i == 0)
            {
                gcd = i;
            }
        }
        
        lcm = (n / gcd) * (m / gcd) * gcd; 
        
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
}
