package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2023 {
    
    static int N;
    static int[] odd = {1, 3, 5, 7, 9};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    //j는 현재 자릿수
    static void DFS(int s, int j){
        if(j == N){
            if(check(s))
                System.out.println(s);
            return;
        }

        if(check(s)){
            for(int i = 0; i < 5; i++){
                DFS((10 * s) + odd[i], j+1);
            }
        } else{
            return;
        }
    }

    //소수 체크 메소드
    static boolean check(int s){
        if(s < 2)
            return false;

        for(int i = 2; i < s; i++){
            if((s % i) == 0)
                return false;
        }

        return true;
    }

}