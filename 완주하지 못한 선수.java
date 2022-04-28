import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> info = new HashMap<String,Integer>();

        for(int i=0;i<participant.length;i++){
            int count = 1;

            if(info.containsKey(participant[i]))
                count = info.get(participant[i])+1;

            info.put(participant[i], count);
        }

        for(int i=0;i<completion.length;i++){
            info.replace(completion[i], info.get(completion[i])-1);
        }

        for(int i=0;i<participant.length;i++){
            if(info.get(participant[i]) != 0 )
            {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}
