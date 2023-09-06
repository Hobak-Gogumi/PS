package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //0이 2개 들어오면 입력 종료
            if((a == 0) && (b == 0))
                break;

            if((b % a) == 0) //첫 번째 숫자가 두 번째 숫자의 약수라면 factor 출력
                sb.append("factor").append("\n");
            else if((a % b) == 0) //첫 번째 숫자가 두 번째 숫자의 배수라면 multiple 출력
                sb.append("multiple").append("\n");
            else //둘 다 아니라면 neither 출력
                sb.append("neither").append("\n");
        }

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}