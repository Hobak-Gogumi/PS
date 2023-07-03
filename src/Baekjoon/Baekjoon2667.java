package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2667 {

    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {1, 0, 0, -1};

    static int N;

    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //입력
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N]; //방문 배열

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < N; j++)
                arr[i][j] = str.charAt(j) - '0'; //str.charAt의 반환형은 char니까 정수로 변환하기 위해서 꼭 - '0' 해주기.

        }
        //---입력 종료

        //탐색
        int count = 0; //총 단지수를 저장할 변수
        ArrayList<Integer> arrayList = new ArrayList<>(); //단지내 집 수 저장
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if((arr[i][j] == 1) && (!visited[i][j])){
                    count++;
                    arrayList.add(BFS(i, j));
                }
            }
        }

        sb.append(count).append("\n");

        //단지내 집 수를 오름차순으로 정렬해야 함
        Collections.sort(arrayList);

        for(int num: arrayList)
            sb.append(num).append("\n");

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    //BFS 메서드
    static int BFS(int i, int j){
        int sum = 0; //단지 내 집의 수를 저장할 배열

        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[] {i, j});
        sum++;

        while(!queue.isEmpty()){
            int[] now = queue.remove();

            for(int k = 0; k < 4; k++){ //상하좌우 확인
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if((x >= 0) && (x < N) && (y >= 0) && (y < N)){
                    if((arr[x][y] == 1) && (!visited[x][y])){
                        visited[x][y] = true;
                        queue.add(new int[] {x, y});
                        sum++;
                    }
                }
            }
        }

        return sum;

    }

}