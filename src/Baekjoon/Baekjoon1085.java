package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_min;
        int y_min;
        if(x < w-x)
            x_min = x;
        else
            x_min = w-x;

        if(y < h-y)
            y_min = y;
        else
            y_min = h-y;

        int ans;
        if(x_min < y_min)
            ans = x_min;
        else
            ans = y_min;

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}