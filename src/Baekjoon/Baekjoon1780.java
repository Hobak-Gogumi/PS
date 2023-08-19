package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1780 {

    static int paperMinusOne = 0;
    static int paperZero = 0;
    static int paperPlusOne = 0;

    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        int N = Integer.parseInt(br.readLine()); //종이 변의 길이
        paper = new int[N][N];

        //종이 정보 입력받기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //입력 종료

        //계산
        solve(0, 0, N);

        //출력
        sb.append(paperMinusOne).append("\n");
        sb.append(paperZero).append("\n");
        sb.append(paperPlusOne).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void solve(int row, int col, int size){
        //종이가 같은 수로 채워졌는지 확인
        //같은 수로 채워졌다면, 무슨 수로 채워진 종이인지 카운팅 후 메서드 종료
        if(check(row, col, size)){
            switch(paper[row][col]){
                case -1:
                    paperMinusOne++;
                    break;
                case 0:
                    paperZero++;
                    break;
                case 1:
                    paperPlusOne++;
                    break;
            }

            return;
        }

        //같은 수로 안채워졌다면, 9개로 자른다.
        int newSize = size/3;
        solve(row, col, newSize);
        solve(row, col + newSize, newSize);
        solve(row, col + 2 * newSize, newSize);
        solve(row + newSize, col, newSize);
        solve(row + newSize, col + newSize, newSize);
        solve(row + newSize, col + 2 * newSize, newSize);
        solve(row + 2 * newSize, col, newSize);
        solve(row + 2 * newSize, col + newSize, newSize);
        solve(row + 2 * newSize, col + 2 * newSize, newSize);
    }

    //종이가 같은 수로 채워졌는지 확인하는 메서드
    static boolean check(int row, int col, int size){
        int num = paper[row][col];

        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(paper[i][j] != num){
                    return false;
                }
            }
        }

        return true;
    }

}