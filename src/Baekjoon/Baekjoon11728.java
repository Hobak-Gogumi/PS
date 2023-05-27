package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력 받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }
        //--입력 종료

        //배열 A의 포인터 idxA, 배열 B의 포인터 idxB
        int idxA = 0;
        int idxB = 0;

        while(true){
            if((idxA == N) && (idxB == M)){
                break;
            } else if((idxA == N) && (idxB < M)){
                for(int i = idxB; i < M; i++){
                    bw.write(B[i] + " ");
                }
                break;
            } else if((idxA < N) && (idxB == M)){
                for(int i = idxA; i < N; i++){
                    bw.write(A[i] + " ");
                }
                break;
            } else if((idxA < N) && (idxB < M)){
                if(A[idxA] <= B[idxB]) {
                    bw.write(A[idxA] + " ");
                    idxA++;
                }
                else{
                    bw.write(B[idxB] + " ");
                    idxB++;
                }
            }
        }

        bw.flush();
        bw.close();
    }

}

//Arrays.sort() 사용한 방식
//public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    StringTokenizer st;
//
//    //입력 받기
//    st = new StringTokenizer(br.readLine());
//    int N = Integer.parseInt(st.nextToken());
//    int M = Integer.parseInt(st.nextToken());
//    int[] A = new int[N];
//    int[] B = new int[M];
//
//    //합칠 배열 생성
//    int[] arr = new int[N+M];
//
//    st = new StringTokenizer(br.readLine());
//    for(int i = 0; i < N; i++){
//        arr[i] = Integer.parseInt(st.nextToken());
//    }
//
//    st = new StringTokenizer(br.readLine());
//    for(int i = 0; i < M; i++){
//        arr[i+N] = Integer.parseInt(st.nextToken());
//    }
//    //--입력 종료
//
//    Arrays.sort(arr);
//
//    for(int num: arr){
//        bw.write(num + " ");
//    }
//
//    bw.flush();
//    bw.close();
//}