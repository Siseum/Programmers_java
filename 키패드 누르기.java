import java.util.*;

class KeyPos{

    KeyPos(int y, int x){
        this.y = y;
        this.x = x;
    }

    int y;
    int x;
}

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();
        String answer;

        KeyPos leftPos = new KeyPos(3,0);
        KeyPos rightPos= new KeyPos(3,2);
        KeyPos[] keyPos = new KeyPos[10];
        keyPos[0] = new KeyPos(3,1);

        for(int i=1;i<10;i++)
        {
            keyPos[i] = new KeyPos((i-1)/3,(i+2)%3);
        }

        for(int i=0;i<numbers.length;i++)
        {
            int number = numbers[i];
            if(number==1 || number==4|| number==7){
                sb.append("L");
                leftPos = keyPos[number];
            }
            else if(number==3 || number==6||number==9){
                sb.append("R");
                rightPos = keyPos[number];
            }
            else if(number==2 || number==5 || number == 8 || number == 0 ){
                int leftDis = Math.abs(keyPos[number].x-leftPos.x) + Math.abs(keyPos[number].y-leftPos.y);
                int rightDis = Math.abs(keyPos[number].x-rightPos.x) + Math.abs(keyPos[number].y-rightPos.y);

                if(leftDis < rightDis){
                    sb.append("L");
                    leftPos = keyPos[number];
                }
                else if(leftDis > rightDis){
                    sb.append("R");
                    rightPos = keyPos[number];
                }
                else{
                    if(hand.equals("left")) {  // 문자열 비교시 equals 함수를 이용해서 비교해야된다
                        sb.append("L");
                        leftPos = keyPos[number];
                    }
                    else if(hand.equals("right")){
                        sb.append("R");
                        rightPos = keyPos[number];
                    }
                }
            }

        }

        answer = sb.toString();
        return answer;
    }
}
