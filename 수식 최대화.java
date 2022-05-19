import java.util.*;

class Solution 
{
    
    public static long answer = 0L;
    public static Map<Character,Boolean> checkMap = new HashMap<>();

    public static long cal(long a, long b, char oper)
    {
        if(oper == '*')
            return a*b;
        else if(oper =='+')
            return a+b;
        else if(oper =='-')
            return a-b;

        return 0L;
    }

    public static void dfs(int count, List<String> strList, List<Character> operList)
    {
        List<String> tStrList = new ArrayList<>(strList);
        List<Character> tOperList = new ArrayList<>(operList);

        if(count == 1)
        {
            long tSum;

            for(int i=0;i<tOperList.size();i++)
            {
                char op = tOperList.get(i);
                long a = Long.parseLong(tStrList.get(i));
                long b = Long.parseLong(tStrList.get(i+1));

                tOperList.remove(i);
                tStrList.remove(i);
                tStrList.remove(i);
                tStrList.add(i, String.valueOf(cal(a,b, op)));
                i--;
            }

            tSum = Math.abs(Long.parseLong(tStrList.get(0)));
            answer = Math.max(answer, tSum);
            return;
        }

        for(char oper : checkMap.keySet())
        {
            if(checkMap.get(oper)==false)
            {
                for (int i = 0; i < tOperList.size(); i++)
                {
                    if (tOperList.get(i) == oper)
                    {
                        long a = Long.parseLong(tStrList.get(i));
                        long b = Long.parseLong(tStrList.get(i + 1));

                        tOperList.remove(i);
                        tStrList.remove(i);
                        tStrList.remove(i);
                        tStrList.add(i, String.valueOf(cal(a, b, oper)));
                        i--;
                    }
                }

                checkMap.put(oper, true);
                dfs(count -1, tStrList, tOperList);
                checkMap.put(oper, false);
                
                tStrList = new ArrayList<String>(strList);
                tOperList = new ArrayList<Character>(operList);
            }
        }

    }
    
    public long solution(String expression) 
    {
        List<String> strList;
        List<Character> operList = new ArrayList<>();

        strList = new ArrayList<>(Arrays.asList(expression.split("\\*|\\+|-")));
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)=='*' || expression.charAt(i)=='+' || expression.charAt(i)=='-')
            {
                operList.add(expression.charAt(i));
                checkMap.put(expression.charAt(i),false);
            }
        }

        dfs(checkMap.size(), strList, operList);
        return answer;
    }
}
