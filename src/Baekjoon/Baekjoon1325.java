package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1325 {

    static int N;

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] answers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //컴퓨터의 개수
        int M = Integer.parseInt(st.nextToken()); //신뢰 관계 개수

        //인접리스트 생성
        A = new ArrayList[N+1];
        for(int i = 1; i <= N; i++){
            A[i] = new ArrayList<>();
        }

        //방문배열 생성
        visited = new boolean[N+1];

        //신뢰 관계 입력받기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[b].add(a);
            //A가 B를 신뢰하는 경우: B를 해킹시 A도 해킹 가능이라는 뜻이므로 B에서 A로 방향 그래프를 그린다.
        }

        //BFS 수행
        int max = 0; //해킹할 수 있는 가장 많은 컴퓨터의 수를 저장할 변수
        answers = new int[N+1]; //각 컴퓨터를 해킹할 경우, 해킹할 수 있는 총 컴퓨터의 수를 저장할 배열
        for(int i = 1; i <= N; i++){ //각 컴퓨터별로 해킹
            visited = new boolean[N+1]; //방문배열 초기화
            BFS(i);

            max = Math.max(answers[i], max);
        }

        //answers 배열을 돌면서 max값을 가진 인덱스 출력
        for(int i = 1; i <= N; i++){
            if(answers[i] == max)
                sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    //BFS 메서드
    static void BFS(int s){
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int now = queue.remove();

            for(int n : A[now]){
                if(!visited[n]){
                    answers[s]++;
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

}