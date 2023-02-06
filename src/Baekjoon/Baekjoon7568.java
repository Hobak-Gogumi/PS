package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        //입력
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //비교
        for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++){
                if(i == j)
                    continue;
                else{
                    if((arr[j][0] > arr[i][0]) && (arr[j][1] > arr[i][1])){
                        arr[i][2]++;
                    }
                }
            }

        }

        //출력
        for(int i = 0; i < N; i++){
            bw.write(String.valueOf(arr[i][2] + 1) + "\n");
        }

        bw.flush();
        bw.close();
    }

}