package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>(); //약수를 담을 ArrayList 생성

        //계산
        for(int i = 1; i <= N; i++){
            if((N % i) == 0)
                arrayList.add(i);
        }

        //출력
        if(arrayList.size() < K){ //N의 약수의 개수가 K보다 적어서 K번째 약수가 존재하지 않을 때는 0을 출력
            bw.write("0");
        }
        else{
            bw.write(String.valueOf(arrayList.get(K-1))); //K번째 약수를 출력. 주의할 점은 arrayList는 0부터 인덱스가 시작하므로 -1을 빼주고 인덱스 접근해준다.
        }

        bw.flush();
        bw.close();
    }

}