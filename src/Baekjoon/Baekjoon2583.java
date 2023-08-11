package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2583 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int[][] arr;
    static boolean[][] visited;

    static int M;
    static int N;

    static int count; //각 영역의 넓이를 구할때 사용할 변수

    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); //열의 개수
        N = Integer.parseInt(st.nextToken()); //행의 개수
        int K = Integer.parseInt(st.nextToken()); //직사각형의 개수

        arr = new int[N][M];
        visited = new boolean[N][M];

        //각 직사각형의 양 꼭짓점 입력받기. 각 직사각형은 1로 채워주기
        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k] = 1;
                }
            }
        }

        result = new ArrayList<>(); //각 영역의 넓이를 추가할 ArrayList 생성
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if((arr[i][j] == 0) && (!visited[i][j])){ //배열을 전체순회하면서 0이고(직사각형이 아니고), 방문하지 않은 칸 발견시 카운트 증가후 거기서부터 DFS 수행
                    count = 0;
                    DFS(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result); //각 영역의 넓이 오름차순 정렬

        //출력
        sb.append(result.size()).append("\n");
        for(int n : result){
            sb.append(n).append(" ");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    static void DFS(int x, int y){
        visited[x][y] = true;

        count++; //DFS가 수행될 때 마다 count 1 증가 (영역의 넓이를 구하는 것)

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if((newX >= 0) && (newX < N) && (newY >= 0) && (newY < M)){
                if((!visited[newX][newY]) && (arr[newX][newY] == 0)){
                    DFS(newX, newY);
                }
            }
        }

    }

}