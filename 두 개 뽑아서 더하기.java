import java.util.*;

class Solution 
{
    public int[] solution(int[] numbers) 
    {
        int[] answer;
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(i==j)
                    continue;
                treeSet.add(numbers[i]+numbers[j]);
            }
        }

        answer = new int[treeSet.size()];

        int index = 0;
        for(int num : treeSet)
        {
            answer[index++]= num;
        }
        
        return answer;
    }
}
