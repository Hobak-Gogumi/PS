package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력 받기
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //---입력 종료

        //정렬
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[1] != o2[1]) //y좌표가 다른 경우, y좌표가 증가하는 순으로
                    return o1[1] - o2[1];
                else  //y좌표가 같은 경우, x좌표가 증가하는 순으로
                    return o1[0] - o2[0];
            }
        });

        //출력
        for(int i = 0; i < N; i++){
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }

}