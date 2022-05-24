import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty() || stack.peek() != s.charAt(i))
                stack.push(s.charAt(i));

            else if (stack.peek() == s.charAt(i))
                stack.pop();
        }

        if(stack.size() ==0)
            answer = 1;

        return answer;
    }
}
