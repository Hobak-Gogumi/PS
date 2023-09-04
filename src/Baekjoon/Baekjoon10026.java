package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon10026 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int N;

    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine()); //그림 변의 길이

        char[][] matrix1 = new char[N][N];
        char[][] matrix2 = new char[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){ //적록색약이 아닌 사람이 봤을때의 그림
            String input = br.readLine();

            for(int j = 0; j < N; j++){
                matrix1[i][j] = input.charAt(j);
            }
        }

        for(int i = 0; i < N; i++){ //적록색약인 사람이 봤을때의 그림. R과 G를 같은 값으로 인식해야하기 때문에 G를 발견하면 R로 바꿔 넣어준다.
            for(int j = 0; j < N; j++){
                if(matrix1[i][j] == 'G'){
                    matrix2[i][j] = 'R';
                }
                else{
                    matrix2[i][j] = matrix1[i][j];
                }
            }
        }

        //적록색약이 아닌 사람이 봤을때의 구역 BFS
        int countOne = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    countOne++;
                    BFS(matrix1, matrix1[i][j], i, j);
                }
            }
        }

        //적록색약인 사람이 봤을때의 구역 BFS
        visited = new boolean[N][N];
        int countTwo = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    countTwo++;
                    BFS(matrix2, matrix2[i][j], i, j);
                }
            }
        }

        sb.append(countOne).append(" ").append(countTwo);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void BFS(char[][] matrix, char c, int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()){
            int now[] = queue.remove();
            int nowX = now[0];
            int nowY = now[1];
            for(int i = 0; i < 4; i++){
                int X = nowX + dx[i];
                int Y = nowY + dy[i];

                if((X >= 0) && (X < N) && (Y >= 0) && (Y < N)){
                    if((!visited[X][Y]) && (matrix[X][Y] == c)){
                        visited[X][Y] = true;
                        queue.add(new int[] {X, Y});
                    }
                }
            }
        }
    }

}