package Baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>(); //입력으로 포켓몬 이름이 들어왔을때, 그 숫자를 반환할 맵
        String[] arr = new String[N+1]; //입력으로 숫자가 들어왔을때, 포켓몬 이름을 반환할 배열

        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }

        for(int i = 0; i < M; i++){
            String command = br.readLine();
            if((command.charAt(0) >= '1') && (command.charAt(0) <= '9')){ //들어온 문자열의 맨 앞글자를 검사해서 숫자인 경우 -> 문자열을 반환
                int num = Integer.parseInt(command);
                sb.append(arr[num]).append("\n");
            }
            else //그 외는 문자열이 들어오는 경우 -> 숫자를 반환
                sb.append(map.get(command)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}