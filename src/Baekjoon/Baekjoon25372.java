package Baekjoon;

import java.io.*;

public class Baekjoon25372 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //문자열의 총 개수
        
        for(int i = 0; i < N; i++){ //N개의 비밀번호 입력받기
            String password = br.readLine();
            int len = password.length(); //비밀번호의 길이
            
            if((len >= 6) && (len <= 9)){ //비밀번호가 6자리 이상 9자리 이하라면 yes 출력
                sb.append("yes").append("\n");
            }
            else{ //그렇지 않으면 no 출력
                sb.append("no").append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}