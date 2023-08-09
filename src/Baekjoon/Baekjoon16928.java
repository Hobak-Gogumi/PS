package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon16928 {

    static int[] moves;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //사다리의 수
        int M = Integer.parseInt(st.nextToken()); //뱀의 수

        //방문 배열 생성
        visited = new boolean[101];

        //이동해야 할 정보를 담을 moves 배열 생성
        moves = new int[101];

        //각 칸에는 이동해야 할 정보를 담는다.
        //사다리, 뱀이 있는 칸에는 결과적으로 이동하는 칸의 번호를 담고, 없는 칸은 이동이 없으므로 그냥 그 칸의 번호를 넣어준다.
        for(int i = 1; i <= 100; i++){
            moves[i] = i;
        }

        //사다리, 뱀의 정보 입력받기
        for(int i = 0; i < N+M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            moves[x] = y;
        }

        int minMoves = snakeLadderGame();

        bw.write(minMoves + "\n");
        bw.flush();
        bw.close();
    }

    static int snakeLadderGame(){
        Queue<Integer> queue = new LinkedList<>();
        visited[1] = true;
        queue.add(1);
        int rolls = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            //큐에 존재하는 모든 원소들에 적용
            for(int i = 0; i < size; i++){
                int now = queue.remove();

                if(now == 100)
                    return rolls;

                //주사위로 이동가능한 칸이 1~6칸
                for(int j = 1; j <= 6; j++){
                    int next = now + j;

                    if((next <= 100) && (!visited[next])){
                        visited[moves[next]] = true;
                        queue.add(moves[next]);
                    }
                }
            }

            rolls++;
        }

        return -1;

    }

}