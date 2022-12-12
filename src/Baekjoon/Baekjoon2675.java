package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < R; k++){
                    bw.write(str.charAt(j));
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}