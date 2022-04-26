import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> pSet = new TreeSet<Integer>();
        ArrayList<Integer> nArray = new ArrayList<Integer>();

        for(int n : nums)
            nArray.add(n);

        Collections.sort(nArray);

        int answer = 0;
        int count = nums.length/2;
        
        for(int n : nArray)
        {
            pSet.add(n);
            if(pSet.size()>=count)
                break;
        }
        
        answer = pSet.size();
        return answer;
    }
}
