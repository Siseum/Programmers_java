import java.util.*;

class Solution {
    
    static class Pos
    {
        public Pos(int y, int x, int cost)
        {
            this.y = y;
            this.x = x;
            this.cost = cost;
        }
        int y;
        int x;
        int cost;
    }
    
    public int solution(int[][] maps) {
        int answer = -1;
        int row = maps.length;
        int col = maps[0].length;
        boolean[][] check = new boolean[row][col];

        Queue<Pos> posQ = new LinkedList<>();
        Pos pos = new Pos(0,0,1);
        check[0][0]=true;
        posQ.add(pos);

        while(posQ.isEmpty() == false)
        {
            pos = posQ.poll();
            if(pos.y == row-1 && pos.x == col-1)
            {
                if(answer == -1)
                    answer = pos.cost;
                else
                    answer = Math.min(answer, pos.cost);
                break;
            }

            if(pos.y+1 < row && maps[pos.y+1][pos.x] == 1 && check[pos.y+1][pos.x] == false)
            {
                posQ.add(new Pos(pos.y+1,pos.x, pos.cost+1));
                check[pos.y+1][pos.x] = true;
            }

            if(pos.x+1 < col && maps[pos.y][pos.x+1] == 1 && check[pos.y][pos.x+1] == false)
            {
                posQ.add(new Pos(pos.y,pos.x+1, pos.cost+1));
                check[pos.y][pos.x+1] = true;
            }

            if(pos.y-1 >= 0 && maps[pos.y-1][pos.x] == 1 && check[pos.y-1][pos.x] == false)
            {
                posQ.add(new Pos(pos.y-1,pos.x, pos.cost+1));
                check[pos.y-1][pos.x] = true;
            }

            if(pos.x-1 >= 0 && maps[pos.y][pos.x-1] == 1 && check[pos.y][pos.x-1] == false)
            {
                posQ.add(new Pos(pos.y,pos.x-1, pos.cost+1));
                check[pos.y][pos.x-1] = true;
            }
        }

        return answer;
    }
}
