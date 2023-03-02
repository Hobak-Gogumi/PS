package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon25206 {

    static double sum = 0;
    static double count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P"))
                continue;
            else
                calc(credit, grade);
        }

        double ans = sum / count;

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

    static void calc(double credit, String grade){
        double score = 0;

        switch(grade){
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0.0;
                break;
        }

        sum += (credit * score);
        count += credit;
    }

}