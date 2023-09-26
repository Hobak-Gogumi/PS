package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon6064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수

        for(int i = 0; i < T; i++){ //테스트 케이스의 수 만큼 반복
            st = new StringTokenizer(br.readLine());
            long M = Long.parseLong(st.nextToken());
            long N = Long.parseLong(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //M과 N의 최대공약수 구하기
            long gcd = 0;
            if(M >= N){
                gcd = getGcd(M, N);
            }
            else{
                gcd = getGcd(N, M);
            }

            long lcm = M * N / gcd; //M과 N의 최소공배수 구하기

            long j = 0;
            for(j = 0; (M * j) + x <= lcm; j++){
                if((((M * j) + x) - y) % N == 0){
                    break;
                }
            }

            if(lcm <(M * j) + x){
                sb.append(-1).append("\n");
            }
            else{
                sb.append((M * j) + x).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static long getGcd(long m, long n){
        if((m % n) != 0){
            return getGcd(n, (m % n));
        }
        else{
            return n;
        }
    }

}