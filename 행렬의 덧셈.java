class Solution 
{
    public int[][] solution(int[][] arr1, int[][] arr2) 
    {
        int ySize = arr1.length;
        int xSize = arr1[0].length;
        
        int[][] answer = new int[ySize][xSize];
        
        for(int y=0;y<ySize;y++)
        {
            for(int x=0;x<xSize;x++)
            {
                answer[y][x]= arr1[y][x] + arr2[y][x];
            }
        }
        
        return answer;
    }
}
