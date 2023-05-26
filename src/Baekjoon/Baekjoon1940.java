package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력 받기
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //입력 종료

        int count = 0;
        for(int i = 0; i <= N-2; i++){
            for(int j = i+1; j < N; j++){
                if((arr[i] + arr[j]) == M){
                    count++;
                    break;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();

    }

}

/*
[투 포인터 풀이법]

입력 종료 부분 부터

Arrays.sort(arr);

int count = 0;
int min = 0;
int max = N-1;

while(min < max){
    if((arr[min] + arr[max]) == M){
        count++;
        min++;
        max--;
    } else if((arr[min] + arr[max]) < M){
        min++;
    } else if((arr[min] + arr[max]) > M){
        max--;
    }
}

bw.write(count + "\n");
bw.flush();
bw.close();
 */