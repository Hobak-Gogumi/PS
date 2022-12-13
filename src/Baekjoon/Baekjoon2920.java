package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];

        for(int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] asc = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] desc = new int[]{8, 7, 6, 5, 4, 3, 2, 1};

        if(Arrays.equals(arr, asc)){
            bw.write("ascending\n");
        } else if(Arrays.equals(arr, desc)){
            bw.write("descending\n");
        } else{
            bw.write("mixed\n");
        }

        bw.flush();
        bw.close();
    }

}