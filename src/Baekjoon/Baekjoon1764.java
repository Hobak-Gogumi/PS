package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //듣도 못한 사람의 수
        int M = Integer.parseInt(st.nextToken()); //보도 못한 사람의 수

        Set<String> set1 = new HashSet<>(); //듣도 못한 사람을 넣을 집합
        Set<String> set2 = new HashSet<>(); //보도 못한 사람을 넣을 집합

        //N명의 사람을 집합에 넣음(듣도 못한 사람)
        for(int i = 0; i < N; i++){
            set1.add(br.readLine());
        }

        //M명의 사람을 집합에 넣음(보도 못한 사람)
        for(int i = 0; i < M; i++){
            set2.add(br.readLine());
        }

        //교집합 구하기
        set1.retainAll(set2);

        //정렬
        List<String> result = new ArrayList<>(set1); //정렬을 위해서는 HashSet을 List로 바꿔줘야 한다.
        Collections.sort(result);

        //출력
        sb.append(result.size()).append("\n");
        for(String str: result){
            sb.append(str).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}