import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;

        ArrayList<Integer> lostList = new ArrayList<Integer>();
        ArrayList<Integer> reserveList = new ArrayList<Integer>();

        for (int tempt : lost) {
            lostList.add(tempt);
        }

        for (int tempt : reserve) {
            reserveList.add(tempt);
        }

        Collections.sort(lostList);
        Collections.sort(reserveList);
        
        for (int i = 0; i < reserveList.size(); i++)
        {
            for(int j=0;j<lostList.size();j++)
            {
                if(reserveList.get(i) == lostList.get(j)) 
                {
                    answer++;
                    reserveList.remove(i);
                    lostList.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        
        for (int i = 0; i < reserveList.size(); i++)
        {
            for(int j=0;j<lostList.size();j++)
            {
                if(reserveList.get(i)-1 == lostList.get(j)
                || reserveList.get(i)+1 == lostList.get(j)
                  ) 
                {
                    answer++;
                    lostList.remove(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}
