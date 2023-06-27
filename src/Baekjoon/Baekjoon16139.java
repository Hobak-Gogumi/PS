package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon16139 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] arr = new int[S.length()][26];

        arr[0][S.charAt(0) - 'a']++;

        for(int i = 1; i < S.length(); i++){
            for(int j = 0; j < 26; j++){
                arr[i][j] = arr[i-1][j];
            }
            arr[i][S.charAt(i) - 'a']++;
        }

        for(int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());

            char alpha = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int ans;
            if(start == 0)
                ans = arr[end][alpha - 'a'];
            else
                ans = arr[end][alpha - 'a'] - arr[start -1][alpha -'a'];

            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}