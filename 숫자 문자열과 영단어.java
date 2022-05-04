class Solution {
        static String checkNum(String tempt)
    {
        switch(tempt)
        {
            case "zero":
                return "0";
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default:
                return "-1";
        }
    }
    
    
    public int solution(String s) {
        StringBuffer sb = new StringBuffer();

        int index=0;

        while(index<s.length()){

            if(s.charAt(index)>='0' && s.charAt(index)<='9'){
                sb.append(s.charAt(index));
                index++;
            }
            else{
                StringBuffer tempt = new StringBuffer();
                while(true){
                    tempt.append(s.charAt(index));
                    index ++;
                    String numTempt = checkNum(tempt.toString());
                    if(!numTempt.equals("-1")){
                        sb.append(numTempt);
                        break;
                    }
                }
            }
        }

        String answer = sb.toString();
        return Integer.parseInt(answer);
    }
}
