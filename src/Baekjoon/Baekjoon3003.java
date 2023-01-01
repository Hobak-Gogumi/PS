package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int king = 1 - Integer.parseInt(st.nextToken());
        int queen = 1 - Integer.parseInt(st.nextToken());
        int rooks = 2 - Integer.parseInt(st.nextToken());
        int bishops = 2 - Integer.parseInt(st.nextToken());
        int knights = 2 - Integer.parseInt(st.nextToken());
        int pawns = 8 - Integer.parseInt(st.nextToken());

        bw.write(king + " ");
        bw.write(queen + " ");
        bw.write(rooks + " ");
        bw.write(bishops + " ");
        bw.write(knights + " ");
        bw.write(pawns + " ");

        bw.flush();
        bw.close();
    }

}