package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1049 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //끊어진 줄의 수
        int M = Integer.parseInt(st.nextToken()); //기타줄 브랜드의 수

        int minPackageCost = Integer.MAX_VALUE; //가장 싼 패키지의 가격을 담을 변수
        int minPieceCost = Integer.MAX_VALUE; //가장 싼 낱개의 가격을 담을 변수

        //기타줄 브랜드마다의 패키지가격, 낱개가격이 주어짐. 여기서 가장 최소 가격들을 찾을 것이다.
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int pack = Integer.parseInt(st.nextToken());
            minPackageCost = Math.min(minPackageCost, pack);

            int piece = Integer.parseInt(st.nextToken());
            minPieceCost = Math.min(minPieceCost, piece);
        }

        int maxNumPack = (N-1)/6 + 1; //패지키로만 구매할 때 개수를 구한다. (ex. N이 12면 2개를, 13이면 3개를 사야한다)

        int minCost = maxNumPack * minPackageCost;

        for(int i = maxNumPack - 1; i >= 0; i--){
            int numPack = i;
            int numPiece = N - (6 * numPack);

            int sum = (numPack * minPackageCost) + (numPiece * minPieceCost);
            minCost = Math.min(minCost, sum);
        }

        bw.write(minCost + "\n");
        bw.flush();
        bw.close();
    }

}