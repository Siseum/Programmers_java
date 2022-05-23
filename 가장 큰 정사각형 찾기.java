class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        
        for(int y=0;y<board.length;y++)
        {
            if(board[y][0]==1)
            {
                answer = 1;
                break;
            }
        }
        
        for(int x=0;x<board[0].length;x++)
        {
            if(board[0][x]==1)
            {
                answer = 1;
                break;
            }
        }
        
        for(int y=1;y<board.length;y++)
        {
            for(int x=1;x<board[y].length;x++)
            {
                if(board[y][x]==1)
                {
                    board[y][x] = Math.min(Math.min(board[y-1][x-1],board[y-1][x]),board[y][x-1])+1;
                    answer = Math.max(answer,board[y][x]);
                }
            }
        }
        
        answer = answer * answer;
        return answer;
    }
}
