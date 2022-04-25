class Solution 
{
    public int[] solution(int N, int[] stages) 
    {
        int[] answer = new int[N];
        int[] sum = new int[N];
        double[] rate = new double[N];

        for(int i=0;i< N; i++)
        {
            for(int j=0;j<stages.length;j++)
            {
                if(stages[j]-1 == i)
                    sum[i]++;
            }
            answer[i] = i+1;
        }

        int count = stages.length;
        for(int i =0;i<N;i++)
        {
            rate[i] = (double)sum[i] / count;
            count -= sum[i];
        }

        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(rate[i]<rate[j])
                {
                    double tDouble = rate[i];
                    rate[i] = rate[j];
                    rate[j] = tDouble;

                    int tInt = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tInt;
                }
                else if(rate[i]==rate[j] && answer[i] > answer[j])
                {
                    int tInt = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tInt;
                }
            }
        }
        
        return answer;
    }
}
