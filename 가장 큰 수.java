import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strArr = new String[numbers.length];

        for(int i=0;i<numbers.length;i++)
            strArr[i]=String.valueOf(numbers[i]);

        Arrays.sort(strArr, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuffer temptSb = new StringBuffer();
        for(String str : strArr) 
            temptSb.append(str);

        if(temptSb.charAt(0)=='0') {
            temptSb = new StringBuffer();
            temptSb.append("0");
        }
        
        answer = temptSb.toString();
        
        return answer;
    }
}
