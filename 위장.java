import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();

        for(int i=0;i<clothes.length;i++)
        {
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1],0)+1);
        }

        for(String key : clothesMap.keySet())
        {
            answer = answer * (clothesMap.get(key)+1);
        }

        answer = answer -1;


        return answer;
    }
}
