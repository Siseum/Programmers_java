class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0;i<absolutes.length;i++)
        {
            int tempt = absolutes[i];
            if(signs[i]==false)
                tempt = tempt * (-1);
            
            answer += tempt;
            
        }
        
        return answer;
    }
}
