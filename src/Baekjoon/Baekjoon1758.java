package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon1758 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int N = Integer.parseInt(br.readLine()); //사람의 수

        ArrayList<Integer> tips = new ArrayList<>(); //팁의 액수를 넣을 ArrayList
        for(int i = 0; i < N; i++){ //N명의 팁 액수 입력받기
            tips.add(Integer.parseInt(br.readLine()));
        }
        //입력 종료

        //팁 액수 내림차순 정렬
        Collections.sort(tips, Collections.reverseOrder());

        long sum = 0; //팁의 총액을 계산할 변수
        for(int i = 1; i <= N; i++){
            int tip = tips.get(i-1) - i + 1;
            if(tip < 0) //계산한 팁이 음수라면 못받음(0원)
                sum += 0;
            else
                sum += tip;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}