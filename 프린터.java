import java.util.*;

class Solution {

    public static class PrinterInfo
    {
        int priority = 0;
        int location = 0;
    }

    public int solution(int[] priorities, int location) {

        int answer = 1;
        ArrayList<PrinterInfo> pInfoList = new ArrayList<>();

        for(int i=0;i< priorities.length;i++)
        {
            PrinterInfo tPrinterInfo = new PrinterInfo();
            tPrinterInfo.priority=priorities[i];
            tPrinterInfo.location = i;
            pInfoList.add(tPrinterInfo);
        }

        while(true)
        {
            PrinterInfo tPrinterInfo = pInfoList.get(0);
            pInfoList.remove(0);
            int priority = tPrinterInfo.priority;

            for(int i=0;i<pInfoList.size();i++)
            {
                if(pInfoList.get(i).priority  > priority)
                    priority = pInfoList.get(i).priority;
            }

            if(priority > tPrinterInfo.priority)
            {
                pInfoList.add(tPrinterInfo);
                continue;
            }

            else
            {
                if(tPrinterInfo.location == location)
                    break;
                answer++;
            }

        }       

        return answer;
    }
}
