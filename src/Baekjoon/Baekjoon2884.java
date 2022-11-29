package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M >= 45){
            M = M - 45;
        } else{
            if(H == 0){
                H = 23;
                M = M + 15;
            } else{
                H = H - 1;
                M = M + 15;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(H + " " + M + "\n");
        bw.flush();
        bw.close();

    }
}
