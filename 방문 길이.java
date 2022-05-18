class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int posX = 5;
        int posY = 5;
        boolean[][][] check = new boolean[11][11][4];

        for(int i=0;i<dirs.length();i++)
        {
            if(dirs.charAt(i)== 'U' && posY-1>=0)
            {
                if (check[--posY][posX][0] == false)
                {
                    check[posY][posX][0]=true;
                    check[posY+1][posX][1]=true;
                    answer++;
                }
            }

            else if(dirs.charAt(i)== 'D' && posY+1<=10 )
            {
                if(check[++posY][posX][1] == false)
                {
                    check[posY][posX][1]=true;
                    check[posY-1][posX][0]=true;
                    answer++;
                }
            }

            else if(dirs.charAt(i)== 'R'&& posX+1<=10)
            {
                if(check[posY][++posX][2] == false)
                {
                    check[posY][posX][2]= true;
                    check[posY][posX-1][3]=true;
                    answer++;
                }
            }

            else if(dirs.charAt(i)== 'L' && posX-1>=0)
            {
                if(check[posY][--posX][3] == false)
                {
                    check[posY][posX][3]=true;
                    check[posY][posX+1][2]=true;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
