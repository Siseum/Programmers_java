class Solution {
    public long solution(long n) {
        long answer = 0;  
        long num = (long)Math.sqrt(n);
        
        if((num * num) == n)
            answer = (long)Math.pow(num+1,2);
        else
            answer = -1;   
        
        return answer;
    }
}
