package Baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        //입력
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //집합 A의 원소의 개수
        int b = Integer.parseInt(st.nextToken()); //집합 B의 원소의 개수

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }
        //입력 종료

        //합집합 구하기
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        //교집합 구하기
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        //계산
        int result = union.size() - intersection.size();

        //출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}