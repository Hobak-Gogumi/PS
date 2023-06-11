package Baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Map<Integer, Integer> map = new HashMap<>();

        //숫자 카드 N개 입력 받기
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int item = Integer.parseInt(st.nextToken());

            if(!map.containsKey(item))  //map에 숫자카드가 처음 등록될 때
                map.put(item, 1);
            else if(map.containsKey(item)) //map에 숫자카드가 이미 있을 때
                map.replace(item, map.get(item) + 1);
        }

        //M개의 숫자 카드 입력받고, 개수 출력하기
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int item = Integer.parseInt(st.nextToken());

            if(map.containsKey(item))  //map에 입력된 숫자카드가 있으면 개수 출력
                bw.write(map.get(item) + " ");
            else if(!map.containsKey(item)) //map에 입력된 숫자카드가 없으면 0 출력
                bw.write("0 ");
        }

        bw.flush();
        bw.close();
    }

}