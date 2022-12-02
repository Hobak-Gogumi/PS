package Baekjoon;

import java.io.*;

public class Baekjoon2754 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(str.equals("A+")){
            bw.write("4.3");
        } else if(str.equals("A0")){
            bw.write("4.0");
        } else if(str.equals("A-")){
            bw.write("3.7");
        } else if(str.equals("B+")){
            bw.write("3.3");
        } else if(str.equals("B0")){
            bw.write("3.0");
        } else if(str.equals("B-")){
            bw.write("2.7");
        } else if(str.equals("C+")){
            bw.write("2.3");
        } else if(str.equals("C0")){
            bw.write("2.0");
        } else if(str.equals("C-")){
            bw.write("1.7");
        } else if(str.equals("D+")){
            bw.write("1.3");
        } else if(str.equals("D0")){
            bw.write("1.0");
        } else if(str.equals("D-")){
            bw.write("0.7");
        } else{
            bw.write("0.0");
        }

        bw.flush();
        bw.close();
    }

}