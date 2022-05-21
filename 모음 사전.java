class Solution {
    public int solution(String word) {
        
        int answer = 0;  
        StringBuffer wordSb = new StringBuffer(word);
        StringBuffer sb = new StringBuffer();

        while(true)
        {
            if(sb.toString().equals(wordSb.toString()))
                break;

            answer++;

            if(sb.length()<5)
                sb.append('A');

            else if(sb.length()==5)
            {
                if(sb.charAt(4)== 'A')
                    sb.replace(4,5,"E");
                else if(sb.charAt(4)=='E')
                    sb.replace(4,5,"I");
                else if(sb.charAt(4)=='I')
                    sb.replace(4,5,"O");
                else if(sb.charAt(4)=='O')
                    sb.replace(4,5,"U");

                else if(sb.charAt(4)=='U')
                {
                    sb.deleteCharAt(4);
                    for(int i=3;i>=0;i--)
                    {
                        if(sb.charAt(i) =='A')
                        {
                            sb.replace(i, i + 1, "E");
                            break;
                        }
                        else if(sb.charAt(i) =='E')
                        {
                            sb.replace(i, i + 1, "I");
                            break;
                        }
                        else if(sb.charAt(i)=='I')
                        {
                            sb.replace(i,i+1,"O");
                            break;
                        }
                        else if(sb.charAt(i)=='O')
                        {
                            sb.replace(i,i+1,"U");
                            break;
                        }
                        else if(sb.charAt(i)=='U')
                            sb.deleteCharAt(i);
                    }

                }

            }

        }

        return answer;
    }
}
