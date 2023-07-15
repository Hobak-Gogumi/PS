package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        int N = Integer.parseInt(br.readLine());
        int[] distance = new int[N-1];
        int[] price = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++){
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }
        //입력 종료

        long total = (long)price[0] * distance[0]; //0번 도시에서 1번도시로 가는 가격은 무조건 고정이다. 처음 출발할 때는 기름이 없기 때문
        int leastPrice = price[0];
        for(int i = 1; i < N-1; i++){
            if(price[i] < leastPrice)  //현재 도착한 도시의 기름 가격이 싼지, 앞서 주유했던 기름 가격이 더 싼지 비교
                leastPrice = price[i];

            total += (long)leastPrice * distance[i];
        }

        bw.write(total + "\n");
        bw.flush();
        bw.close();

    }

}