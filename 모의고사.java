import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = new int[3][];
        pattern[0] = new int[] { 1,2,3,4,5};
        pattern[1] = new int[] {2,1,2,3,2,4,2,5};
        pattern[2] = new int[] { 3,3,1,1,2,2,4,4,5,5};
        
        int max = 0;
        List<Integer> arrList = new ArrayList<Integer>();
        List<Integer> answerList = new ArrayList<Integer>();


        for(int i=0;i<3;i++)
        {
            int div = pattern[i].length;
            int count = 0;

            for(int j=0;j<answers.length;j++)
            {
                if(answers[j] == pattern[i][j%div])
                    count++;
            }
            max = Math.max(max, count);
            arrList.add(count);
        }

        for(int i = 0; i<arrList.size();i++)
        {
            if(max == arrList.get(i))
                answerList.add(i+1);
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0;i<answerList.size();i++)
            answer[i]= answerList.get(i);
        
        return answer;
    }
}
