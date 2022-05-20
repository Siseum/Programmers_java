import java.util.*;

class Solution {
    
    public enum Dir
    {
        down,
        right,
        up,
    }
    
    public int[] solution(int n) {
        Dir dir = Dir.down;
        ArrayList<Integer> arrList = new ArrayList<>();
        int[][] arr = new int[n][n];
        int number = 1;
        int y=0;
        int x=0;

        while( x>=0 && x<n && y>=0 && y<n && arr[y][x] ==0)
        {
            arr[y][x]=number++;

            if(dir == Dir.down)
            {
                if(y>=n-1 || arr[y+1][x] !=0)
                {
                    dir = Dir.right;
                    x++;
                }
                else
                    y++;
            }

            else if(dir == Dir.right)
            {
                if(x>=n-1 || arr[y][x+1] !=0)
                {
                    dir = Dir.up;
                    x--;
                    y--;
                }
                else
                    x++;
            }

            else if(dir == Dir.up)
            {
                if((x<0 && y<0) || arr[y-1][x-1] !=0)
                {
                    dir = Dir.down;
                    y++;
                }
                else
                {
                    y--;
                    x--;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                arrList.add(arr[i][j]);
        }

        int[] answer = new int[arrList.size()];

        for(int i=0;i<answer.length;i++)
            answer[i]=arrList.get(i);
        
        return answer;
    }
}
