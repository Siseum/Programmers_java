class Solution {
    static int answer;
    static int K;
    static int [][] Dungeons;
    static boolean [] check;

    public static void dfs(int dCount, int tCount)
    {
        for(int i=0;i<Dungeons.length;i++)
        {
            if(check[i]==true)
                continue;

            if(K>=Dungeons[i][0])
            {
                check[i]=true;
                K -= Dungeons[i][1];
                dfs(dCount+1, tCount+1);
                K += Dungeons[i][1];
                check[i]=false;
            }
        }

        answer = Math.max(answer, tCount);
        return;

    }
    
    public int solution(int k, int[][] dungeons) 
    {
        K = k;
        Dungeons = dungeons;
        check = new boolean[Dungeons.length];

        dfs(0, 0);
        
        return answer;
    }
}
