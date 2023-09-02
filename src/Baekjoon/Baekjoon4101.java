package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon4101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if((a == 0) && (b == 0))
                break;

            if(a > b)
                sb.append("Yes\n");
            else
                sb.append("No\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}