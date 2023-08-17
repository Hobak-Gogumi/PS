package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2630 {

    static int white = 0; //하얀색 색종이의 개수
    static int blue = 0; //파란색 색종이의 개수

    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        int N = Integer.parseInt(br.readLine()); //전체 종이의 한 변의 길이
        board = new int[N][N]; //전체 종이

        //종이 색 입력받기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //입력 종료

        solve(0, 0, N);

        //출력
        bw.write(white + "\n");
        bw.write(blue + "\n");
        bw.flush();
        bw.close();
    }

    static void solve(int row, int col, int size){ //메서드의 인자는 색종이 맨 왼쪽위 꼭짓점의 행번호, 열번호, 색종이의 변길이 총 3가지
        int whiteCount = 0;
        int blueCount = 0;
        for(int i = row; i < row+size; i++){ //색종이 전체탐색 하면서 색상 카운트
            for(int j = col; j < col+size; j++){
                if(board[i][j] == 0)
                    whiteCount++;
                else if(board[i][j] == 1)
                    blueCount++;
            }
        }

        if(whiteCount == (size * size)){ //색종이가 전부 하얀색으로 칠해져있으면, 하얀색 색종이 카운트 증가 후 메서드 종료
            white++;
            return;
        } else if(blueCount == (size * size)){ //색종이가 전부 파란색으로 칠해져있으면, 파란색 색종이 카운트 증가 후 메서드 종료
            blue++;
            return;
        }

        //하얀색 색종이도, 파란색 색종이도 아니면(색이 섞여있다면) 4조각으로 분할해서 다시 탐색해야함.
        int newSize = size/2;

        solve(row, col, newSize);
        solve(row, col + newSize, newSize);
        solve(row + newSize, col, newSize);
        solve(row + newSize, col + newSize, newSize);
    }

}