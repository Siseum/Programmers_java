class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        boolean[][] check= new boolean[id_list.length][id_list.length];
        int[] count = new int[id_list.length];

        for(int i=0;i<report.length;i++) {
            int start = 0;
            int end = 0;
            String[] tempt = report[i].split(" ");

            for (int j = 0; j < id_list.length; j++) {
                if (tempt[0].equals(id_list[j]))
                    start = j;
                else if (tempt[1].equals(id_list[j]))
                    end = j;
            }

            if (check[start][end] != true) {
                check[start][end] = true;
                count[end]++;
            }
        }

        for(int i=0;i<id_list.length;i++)
        {
            for(int j=0;j<id_list.length;j++)
            {
                if(check[i][j]==true && count[j]>=k)
                    answer[i]++;
            }
        }
        return answer;
    }
}
