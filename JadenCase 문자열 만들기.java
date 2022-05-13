class Solution {
    public String solution(String s) {
        String answer = "";

        StringBuffer sb = new StringBuffer(s);
        boolean isFirst = true;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i) == ' ')
            {
                isFirst=true;
                continue;
            }

            if(isFirst == true) 
            {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                isFirst = false;
            }
            else
            {
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            }
        }

        answer = sb.toString();
        
        return answer;
    }
}
