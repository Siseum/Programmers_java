class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0;i< skill_trees.length;i++)
        {
            StringBuffer sb = new StringBuffer();

            for(int j=0;j<skill_trees[i].length();j++)
            {
                String tempt = String.valueOf(skill_trees[i].charAt(j));
                if(skill.contains(tempt))
                {
                    sb.append(skill_trees[i].charAt(j));
                }
            }

            boolean isCount = true;

            for(int j=0;j<sb.length();j++)
            {
                if(sb.charAt(j) != skill.charAt(j))
                {
                    isCount = false;
                    break;
                }
            }

            if(isCount)
                answer++;
        }
        
        return answer;
    }
}
