class Solution {
    public String solution(String phone_number) {
        StringBuilder tempt = new StringBuilder(phone_number);
        
        int Count = tempt.length() - 4;
        
        for(int i=0;i<Count;i++)
        {
            tempt.setCharAt(i, '*');
        }
        
        String answer = new String(tempt);
        return answer;
    }
}
