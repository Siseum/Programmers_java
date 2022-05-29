import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> wordList = new ArrayList<>();

        int[] info = new int[n];

        for(int i=0;i<words.length;i++)
        {
            info[i%n]++;
            if(
                    ((i>0)
                    && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
                   || (wordList.contains(words[i]))
            )
            {
                answer[0] = i%n+1;
                answer[1] = info[i%n];
                break;
            }

            wordList.add(words[i]);
        }

        return answer;
    }
}
