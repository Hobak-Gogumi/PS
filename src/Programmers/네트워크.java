package Programmers;

public class 네트워크 {

    static int N;
    static int count = 0;
    static boolean[] visited;

    public int solution(int n, int[][] computers) {

        N = n;
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                DFS(i, computers);
            }
        }

        return count;
    }

    void DFS(int s, int[][] arr){
        if(visited[s]){
            return;
        } else{
            visited[s] = true;
            for(int i = 0; i < N; i++){
                if((arr[s][i] == 1) && (!visited[i]))
                    DFS(i, arr);
            }
        }
    }

}