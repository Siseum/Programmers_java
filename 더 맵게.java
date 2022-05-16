import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0;i<scoville.length;i++)
            pq.add(scoville[i]);

        while(true)
        {
            if(pq.size()==1)
            {
                if(pq.peek()<K)
                    answer = -1;
                break;
            }

            boolean isEnd = true;
            for(int tempt : pq)
            {
                if(tempt < K)
                {
                    isEnd = false;
                    break;
                }
            }

            if(isEnd)
                break;

            int first = pq.remove();
            int second = pq.remove();

            int mix = first + (second * 2);

            pq.add(mix);
            answer++;
        }
        
        return answer;
    }
}
