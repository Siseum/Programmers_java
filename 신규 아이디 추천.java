class Solution {
    
    public static StringBuffer first(StringBuffer temptSb)
    {
        String tempt = temptSb.toString().toLowerCase();
        return new StringBuffer(tempt);
    }

    public static void second(StringBuffer temptSb)
    {
        for(int i=0;i<temptSb.length();i++){
            char tChar = temptSb.charAt(i);
            if(
                    !(('a'<=tChar && tChar <='z') || ('0'<=tChar && tChar<='9')
                    || (tChar == '-') || (tChar == '_') || (tChar =='.'))
            ){
                temptSb.deleteCharAt(i);
                i--;
            }
        }
    }

    public static void third(StringBuffer temptSb)
    {
        int dotCount = 0;
        for(int i=0;i<temptSb.length();i++){
            dotCount++;
            if(temptSb.charAt(i) =='.' && dotCount > 1){
                temptSb.deleteCharAt(i);
                i--;
            }
            else if(temptSb.charAt(i) !='.'){
                dotCount = 0;
            }
        }
    }

    public static void fourth(StringBuffer temptSb)
    {
        int start =0;
        if(temptSb.charAt(start)=='.')
            temptSb.deleteCharAt(start);

        int end = temptSb.length()-1;
        if(end>=0 && temptSb.charAt(end)=='.')
            temptSb.deleteCharAt(end);
    }

    public static void fifth(StringBuffer temptSb)
    {
        if(temptSb.toString().isEmpty()==true)
            temptSb.append('a');
    }

    public static void sixth(StringBuffer temptSb)
    {
        if(temptSb.length()>15){
            int Size = temptSb.length();
            temptSb.delete(15,Size);
        }
        if(temptSb.charAt(temptSb.length()-1)=='.')
            temptSb.deleteCharAt(temptSb.length()-1);
    }

    public static void seventh(StringBuffer temptSb)
    {
        int index = temptSb.length()-1;
        while(temptSb.length()<3){
            temptSb.append(temptSb.charAt(index));
            index++;
        }
    }

    
    public String solution(String new_id) {
        String answer = "";
        StringBuffer sb = new StringBuffer(new_id);

        sb = first(sb);
        second(sb);
        third(sb);
        fourth(sb);
        fifth(sb);
        sixth(sb);
        seventh(sb);
        
        answer = sb.toString();
        
        return answer;
    }
}
