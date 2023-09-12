package Baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        //집합에 포함되어 있는 N개의 문자열
        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        //M개의 문자열 중 몇개가 집합에 포함되어 있는지 계산
        int count = 0;

        for(int i = 0; i < M; i++){
            String str = br.readLine();
            if(set.contains(str))
                count++;
        }

        bw.write(String.valueOf(count) + "\n");
        bw.flush();
        bw.close();
    }

}