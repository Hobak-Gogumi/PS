package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int ans;
        if(((V-B) % (A-B)) == 0)
            ans = (V-B) / (A-B);
        else
            ans = ((V-B) / (A-B)) + 1;

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}