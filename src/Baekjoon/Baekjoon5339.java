package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon5339 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("     /~\\").append("\n");
        sb.append("    ( oo|").append("\n");
        sb.append("    _\\=/_").append("\n");
        sb.append("   /  _  \\").append("\n");
        sb.append("  //|/.\\|\\\\").append("\n");
        sb.append(" ||  \\ /  ||").append("\n");
        sb.append("============").append("\n");
        sb.append("|          |").append("\n");
        sb.append("|          |").append("\n");
        sb.append("|          |").append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}