class Solution {
    
    static int answer =0;
    static int target = 0;
    static int[] number;

    static void dfs(int index, int tempt)
    {
        if(index == number.length)
        {
            if(tempt == target)
                answer++;
            return;
        }

        dfs(index+1, tempt+number[index]);
        dfs(index+1,tempt-number[index]);
    }
    
    public int solution(int[] n, int t) {
        number = n;
        target = t;
        
        dfs(0,0);
        
        return answer;
    }
}
