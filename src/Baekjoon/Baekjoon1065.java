package Baekjoon;

import java.io.*;

public class Baekjoon1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0; //한수의 개수 카운팅
        for(int i = 1; i <= N; i++){

            if(i <= 99){ //1~99는 무조건 한수
                count++;
                continue;
            }

            if(i == 1000) //1000은 한수가 아니므로, 반복문 탈출
                break;

            //결국 우린 세자릿수들만 한수인지 아닌지 판별하면 됨

            String str = String.valueOf(i);
            char[] arr = str.toCharArray();

            if((arr[0] - arr[1]) != (arr[1] - arr[2])) //자릿수가 등차수열을 이루지 않으면 그냥 다음 수로
                continue;

            //자릿수가 등차수열을 이뤘다면 count 증가
            count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}