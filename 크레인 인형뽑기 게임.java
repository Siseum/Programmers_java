import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {

        int answer=0;
        Stack<Integer> sBoard = new Stack<Integer>();

        for(int i=0;i<moves.length;i++)
        {
            int order = moves[i]-1;
            int tempt = 0;
            for(int j=0;j<board.length;j++)
            {
                if(board[j][order] !=0)
                {
                    tempt = board[j][order];
                    board[j][order]=0;
                    break;
                }
            }
            
            if(tempt == 0)
                continue;
            
            if(sBoard.isEmpty() || sBoard.peek() != tempt)
                sBoard.push(tempt);

            else if(sBoard.peek() == tempt)
            {
                sBoard.pop();
                answer+=2;
            }

        }

        return answer;
    }
}
