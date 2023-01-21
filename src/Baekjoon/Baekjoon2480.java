package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] d = new int[3];
        for(int i = 0; i < 3; i++){
            d[i] = Integer.parseInt(st.nextToken());
        }

        int ans;
        if((d[0] == d[1]) && (d[0] == d[2]) && (d[1] == d[2])){
            ans = 10000 + (d[0] * 1000);
        } else if((d[0] == d[1]) && (d[0] != d[2]) && (d[1] != d[2])){
            ans = 1000 + (d[0] * 100);
        } else if((d[0] != d[1]) && (d[0] == d[2]) && (d[1] != d[2])){
            ans = 1000 + (d[0] * 100);
        } else if((d[0] != d[1]) && (d[0] != d[2]) && (d[1] == d[2])){
            ans = 1000 + (d[1] * 100);
        } else {
            int max = d[0];
            for(int i = 0; i < 3; i++){
                if(d[i] > max)
                    max = d[i];
            }
            ans = (max * 100);
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}