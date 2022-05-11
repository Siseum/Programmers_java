import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        Integer[] iArr = new Integer[str.length];

        for(int i=0;i<str.length;i++)
        {
            iArr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(iArr);

        answer += String.valueOf(iArr[0]);
        answer += " ";
        answer += String.valueOf(iArr[iArr.length-1]);
        
        return answer;
    }
}
