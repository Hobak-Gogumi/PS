package Baekjoon;

import java.io.*;

public class Baekjoon1992 {

    static StringBuilder sb = new StringBuilder();

    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int N = Integer.parseInt(br.readLine()); //영상의 크기
        board = new char[N][N]; //영상을 저장할 배열

        //영상 입력받기
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                board[i][j] = str.charAt(j);
            }
        }
        //입력 종료

        quadTree(0, 0, N);

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void quadTree(int row, int col, int size){

        int zeroCount = 0;
        int oneCount = 0;

        //압축이 가능한지 확인
        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(board[i][j] == '0')
                    zeroCount++;
                else if(board[i][j] == '1')
                    oneCount++;
            }
        }

        if(zeroCount == (size * size)){
            sb.append(0);
            return;
        } else if(oneCount == (size * size)){
            sb.append(1);
            return;
        }
        //압축이 가능하다면 압축값 출력 후 메서드 종료

        //압축이 불가능하다면 4개의 영상으로 나눈다.
        int newSize = size/2;

        sb.append("(");
        quadTree(row, col, newSize);
        quadTree(row, col + newSize, newSize);
        quadTree(row + newSize, col, newSize);
        quadTree(row + newSize, col + newSize, newSize);
        sb.append(")");
    }

}