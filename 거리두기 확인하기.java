class Solution {
    
    static char[][] pArr = new char[5][5];
    static int[] answer = null;

    static boolean rightCheck(int row, int col)
    {
        for(int i= 0;i<2;i++)
        {
            col++;
            if(col>4 || pArr[row][col] == 'X')
                return true;

            if(pArr[row][col]=='P')
                return false;
        }

        return true;
    }

    static boolean downCheck(int row, int col)
    {
        for(int i= 0;i<2;i++)
        {
            row++;
            if(row>4 || pArr[row][col] == 'X')
                return true;

            if(pArr[row][col]=='P')
                return false;
        }

        return true;
    }

    static boolean diagonalRightCheck(int row, int col)
    {
        row++;
        col++;

        if(row>4 || col > 4)
            return true;

        if(pArr[row][col] =='O' || pArr[row][col]=='X')
            return true;

        if(pArr[row-1][col] == 'X' && pArr[row][col-1]=='X')
            return true;

        return false;
    }

    static boolean diagonalLeftCheck(int row, int col)
    {
        row++;
        col--;

        if(row>4 || col < 0)
            return true;

        if(pArr[row][col] =='O' || pArr[row][col]=='X')
            return true;

        if(pArr[row-1][col] == 'X' && pArr[row][col+1]=='X')
            return true;

        return false;
    }
    
    public int[] solution(String[][] places) {
        answer = new int[places.length];

        for(int i=0;i<places.length;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int k=0;k<5;k++)
                    pArr[j][k]= places[i][j].charAt(k);
            }

            boolean isOk = true;
            for(int j=0;j<5;j++)
            {
                if(isOk == false)
                    break;
                for(int k=0;k<5;k++)
                {
                    if(pArr[j][k]=='P' &&
                            (rightCheck(j,k)==false
                                    || downCheck(j,k)== false
                                    || diagonalRightCheck(j,k)== false
                                    || diagonalLeftCheck(j,k) == false
                            ))
                    {
                        isOk = false;
                        break;
                    }
                }
            }

            if(isOk == true)
                answer[i]=1;
            else
                answer[i]=0;
        }
        
        return answer;
    }
}
