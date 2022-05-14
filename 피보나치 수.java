class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[3];
        arr[0]=0;
        arr[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            arr[i%3]= (arr[(i-1)%3]+arr[(i-2)%3]) % 1234567;
        }
        
        answer = arr[n%3];
        return answer;
    }
}
