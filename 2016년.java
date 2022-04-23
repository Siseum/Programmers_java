class Solution 
{
    public String solution(int a, int b) 
    {
        int day = b;
        String answer = "";
        
        for(int i=1;i<a;i++)
        {
            if(i ==1 || i == 3 || i==5 || i == 7 || i == 8 ||
              i == 10 || i == 12)
                day+=31;
            else if(i == 2)
                day += 29;
            else
                day +=30;
        }
        
        switch(day % 7)
        {
            case 0 :
                answer = "THU";
                break;
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
        }
        
        return answer;
    }
}
