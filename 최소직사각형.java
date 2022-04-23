import java.util.*;

class Solution 
{
    public int solution(int[][] sizes) 
    {
        int answer = 0;
        
        int width[] = new int[sizes.length];
        int height[] = new int[sizes.length];
        
        for(int i=0;i<sizes.length;i++)
        {
            width[i] = Math.max(sizes[i][0], sizes[i][1]);
            height[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        int h = Arrays.stream(height).max().getAsInt();
        int w = Arrays.stream(width).max().getAsInt();
           
        answer = h*w;
        return answer;
    }
}
