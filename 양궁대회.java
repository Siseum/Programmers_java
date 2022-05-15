class Solution {

    static int arrow;
    static int[] ryan = new int[11];
    static int[] apeach = new int[11];
    static int[] result = new int[11];
    static int diff = 0;

    public static void dfs(int index, int arrows)
    {
        if(index == 11 || arrows == 0)
        {
            int ryanScore=0;
            int apeachScore=0;
            for(int i=0;i<=10;i++)
            {
                if(ryan[i]>0 && ryan[i]>apeach[i])
                    ryanScore += 10-i;
                else if(apeach[i]>0 && apeach[i]>=ryan[i])
                    apeachScore += 10-i;
            }

            if(ryanScore > apeachScore && ryanScore - apeachScore > diff)
            {
                diff = ryanScore - apeachScore;
                result = ryan.clone();
            }

            else if(ryanScore > apeachScore && ryanScore - apeachScore == diff)
            {
                diff = ryanScore - apeachScore;

                for(int i= 10;i>=0;i--)
                {
                    if(ryan[i]>result[i]) {
                        result = ryan.clone();
                        break;
                    }
                    else if(ryan[i] < result[i])
                        break;
                }
            }

            return;
        }

        if(index == 10)
        {
            ryan[10] += arrows;
            dfs(index+1, arrows-arrows);
            ryan[10] -= arrows;
            return;
        }

        if(apeach[index] < arrows)
        {
            ryan[index] = apeach[index]+1;
            dfs(index+1, arrows - ryan[index]);
            ryan[index] -= apeach[index]+1;
        }

        dfs(index+1,arrows);
    }
    
    public int[] solution(int n, int[] info) {
        arrow = n;
        apeach = info;

        dfs(0,arrow);
        
        boolean isZero = true;
        
        for(int i=0;i<=10;i++)
        {
            if(result[i] !=0)
            {
                isZero=false;
                break;
            }
        }
        
        if(isZero)
        {
            result = new int[1];
            result[0]= -1;
        }
        
        return result;
    }
}
