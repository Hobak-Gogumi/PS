package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2468 {

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static int N;

    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        int minHeight = 101; //지역 내에서 가장 낮은 높이
        int maxHeight = 0; //지역 내에서 가장 높은 높이
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                int height = Integer.parseInt(st.nextToken());
                arr[i][j] = height;

                if(height < minHeight)
                    minHeight = height;

                if(height > maxHeight)
                    maxHeight = height;
            }
        }
        //입력 종료

        //BFS수행
        //높이가 i이하인 지점을 모두 잠기게 하는 비가 내린다.
        int max = 0;
        for(int i = minHeight - 1; i <= maxHeight - 1; i++){

            //방문배열 초기화
            initVisit();

            int count = 0; //연결 요소의 개수 count하는 변수
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    if((arr[j][k] > i) && (!visited[j][k])){
                        count++;
                        BFS(j, k, i);
                    }
                }
            }

            if(count > max)
                max = count;
        }

        //출력
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

    //BFS 메서드
    static void BFS(int x, int y, int h){
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] now = queue.remove();

            for(int i = 0; i < 4; i++){
                int newX = now[0] + dx[i];
                int newY = now[1] + dy[i];

                if((newX >= 0) && (newX < N) && (newY >= 0) && (newY < N)){
                    if((arr[newX][newY] > h) && (!visited[newX][newY])){
                        visited[newX][newY] = true;
                        queue.add(new int[] {newX, newY});
                    }
                }
            }
        }

    }

    //방문 배열 초기화 메서드
    static void initVisit(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                visited[i][j] = false;
            }
        }
    }

}
