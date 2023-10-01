package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Character> answer = new ArrayList<>();
        while(N != 0){
            int remainder = N % B;

            if((0 <= remainder) && (remainder <= 9)){
                answer.add((char) (remainder + 48));
            }
            else if((10 <= remainder) && (remainder <= 35)){
                answer.add((char) (remainder + 55));
            }

            N = N / B;
        }
        
        //출력
        for(int i = answer.size() - 1; i >= 0; i--){
            bw.write(answer.get(i));
        }
        bw.flush();
        bw.close();
    }

}