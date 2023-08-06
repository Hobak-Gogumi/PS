package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon7562 {

    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static int[][] arr; //체스판

    static int l;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수

        for(int i = 0; i < T; i++){
            l = Integer.parseInt(br.readLine()); //체스판 한 변의 길이
            arr = new int[l][l];

            st = new StringTokenizer(br.readLine()); //나이트가 현재 있는 칸
            int currentX = Integer.parseInt(st.nextToken());
            int currentY = Integer.parseInt(st.nextToken());
            arr[currentX][currentY] = 1;

            st = new StringTokenizer(br.readLine()); //나이트가 이동하려고 하는 칸
            int goalX = Integer.parseInt(st.nextToken());
            int goalY = Integer.parseInt(st.nextToken());

            BFS(currentX, currentY);

            sb.append(arr[goalX][goalY] - 1).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void BFS(int a, int b){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {a, b});

        while(!queue.isEmpty()){
            int[] now = queue.remove();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 8; i++){
                int x = nowX + dx[i];
                int y = nowY + dy[i];

                if((x >= 0) && (x < l) && (y >= 0) && (y < l)){
                    if(arr[x][y] == 0){
                        queue.add(new int[] {x, y});
                        arr[x][y] = arr[nowX][nowY] + 1;
                    }
                }
            }
        }

    }

}