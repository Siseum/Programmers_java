import java.util.*;

class Solution {

    static class Info{
        int weight;
        int length;
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Info[] infos = new Info[truck_weights.length];
        Queue<Info> qInfo = new LinkedList<>();
        int count = 0;
        int tWeight = 0;

        for(int i=0;i< infos.length;i++)
        {
            infos[i] = new Info();
            infos[i].weight = truck_weights[i];
            infos[i].length = 0;
        }
      
        while(true)
        {
            answer++;
            if(count == truck_weights.length && qInfo.isEmpty() == true)
                break;

            if(qInfo.size()<bridge_length && count < infos.length && infos[count].weight  + tWeight <= weight)
            {
                qInfo.add(infos[count]);
                tWeight += infos[count].weight;
                count++;
            }

            for(Info info : qInfo)
            {
                info.length++;
            }

            if(qInfo.peek().length == bridge_length)
            {
                tWeight -= qInfo.peek().weight;
                qInfo.poll();
            }

        }
        return answer;
    }
}
