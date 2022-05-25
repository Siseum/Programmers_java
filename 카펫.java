class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1;i<=yellow;i++)
        {
            if(yellow % i == 0)
            {
                int y = i;
                int x = yellow / y;
                
                if(((y+2)*2+x*2)==brown)
                {
                    answer[0] = x+2;
                    answer[1] = y+2;
                    break;
                }
            }
        }
        
        return answer;
    }
}
