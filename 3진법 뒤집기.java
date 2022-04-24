class Solution 
{
    public int solution(int n) 
    {
        int answer = 0;
        StringBuffer sb = new StringBuffer();


        while(n !=0)
        {
            sb.append(n%3);
            n /=3;
        }

        sb.reverse();
        int multiple = 1;

        for(int i=0;i<sb.length();i++)
        {
            answer += (multiple * (sb.charAt(i) - '0'));
            multiple *=3;
        }
        
        return answer;
    }
}
