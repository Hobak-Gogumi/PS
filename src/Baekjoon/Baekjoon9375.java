package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon9375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 수

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>(); //옷의 종류를 key, 개수를 value로 가지는 Map 생성
            for(int j = 0; j < n; j++){
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken(); //의상의 이름
                String kind = st.nextToken(); //의상의 종류

                if(!map.containsKey(kind))
                    map.put(kind, 1);
                else
                    map.replace(kind, map.get(kind) + 1);
            }

            Collection<Integer> values = map.values();
            int sum = 1;
            for(int value : values)
                sum = sum * (value + 1);

            int ans = sum - 1; //알몸인 경우(모두 선택 안했을 경우) 한 가지를 제거

            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}