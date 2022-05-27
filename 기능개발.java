import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {   
        ArrayList<Integer> pList = new ArrayList<>();
        ArrayList<Integer> sList = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i : progresses)
            pList.add(i);
        for(int i : speeds)
            sList.add(i);

        while(pList.size() !=0)
        {
            for(int i=0;i<pList.size();i++)
            {
                pList.set(i, pList.get(i) + sList.get(i));
            }

            int count = 0;
            for(int i=0;i<pList.size();i++)
            {
                if(pList.get(i)<100)
                    break;

                count++;
                pList.remove(i);
                sList.remove(i);
                i--;
            }

            if(count >0)
                arrList.add(count);
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++)
            answer[i] = arrList.get(i);
        
        return answer;
    }
}
