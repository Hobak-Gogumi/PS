package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon18111 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //첫째 줄 입력받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] ground = new int[N][M];

        //땅의 높이 입력받기. 입력받으면서 땅에 블록이 총 몇개있는지 구함.
        int totalBlock = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int h = Integer.parseInt(st.nextToken());
                ground[i][j] = h;
                totalBlock += h;
            }
        }

        totalBlock += B; //인벤토리에 있는 블록까지 더하면 총 가지고 있는 블럭 개수가 나온다.

        //가능한 높이는 0부터 256.
        int minTime = Integer.MAX_VALUE;
        int height = 0;
        for(int i = 0; i <= 256; i++){
            //현재 높이(i)를 만들기 위한 필요한 블록의 개수: N*M*i
            //totalBlock >= (N*M*i)면 i 높이로 땅을 고를 수 있다.
            int time = 0;
            if(totalBlock >= (N * M * i)){
                for(int j = 0; j < N; j++){
                    for(int k = 0; k < M; k++){
                        if(ground[j][k] < i){ //현재 높이가 목표 높이보다 낮을 때: 블럭을 차이만큼 추가해주어야 함
                            time += (i - ground[j][k]);
                        } else if(ground[j][k] == i){ //현재 높이가 목표 높이와 같을 때: 계산 X
                            time += 0;
                        } else if(ground[j][k] > i){ //현재 높이가 목표 높이보다 높을 때: 블럭을 차이만큼 제거해주어야 함
                            time += ((ground[j][k] - i) * 2);
                        }
                    }
                }
            } else{
                continue;
            }

            //i 높이를 만들기 위해 필요한 시간을 다 계산했다면, 최소시간인지 비교한다.
            if(time <= minTime){
                minTime = time;
                height = i;
            }
        }

        bw.write(minTime + " " + height + "\n");
        bw.flush();
        bw.close();

    }

}