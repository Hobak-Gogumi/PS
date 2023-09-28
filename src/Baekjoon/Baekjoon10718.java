package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon10718 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("강한친구 대한육군").append("\n");
        sb.append("강한친구 대한육군").append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}