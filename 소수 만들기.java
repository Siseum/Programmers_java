import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[3000];
        Arrays.fill(isPrime,true);

        for(int i=2;i< isPrime.length;i++)
        {
            if(isPrime[i]==true)
            {
                for(int j=2;i*j<isPrime.length;j++)
                {
                    isPrime[i*j] = false;
                }
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int tempt = nums[i]+nums[j]+nums[k];
                    if(tempt < isPrime.length && isPrime[tempt])
                        arrList.add(tempt);
                }
            }
        }

        answer = arrList.size();

        return answer;
    }
}
