package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon4796 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNum = 1;
        while(true){
            st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if((L == 0) && (P == 0) && (V == 0))
                break;

            int a = V / P;
            int ans = a * L;

            if((V - a * P) >= L)
                ans += L;
            else
                ans += (V - a * P);

            sb.append("Case ").append(caseNum).append(": ").append(ans).append("\n");

            caseNum++;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}