class Solution {
    public String solution(String s) 
    {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        int sLength = s.length();
        if(sLength % 2 ==0)
        {
            sb.append(s.charAt(sLength/2 -1));
            sb.append(s.charAt(sLength/2));
        }
        else
        {
            sb.append(s.charAt(sLength/2));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
