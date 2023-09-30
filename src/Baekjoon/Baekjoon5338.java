package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon5338 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("       _.-;;-._ \n");
        sb.append("'-..-'|   ||   |\n");
        sb.append("'-..-'|_.-;;-._|\n");
        sb.append("'-..-'|   ||   |\n");
        sb.append("'-..-'|_.-''-._|\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}