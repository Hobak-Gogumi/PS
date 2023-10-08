package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2083 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if((name.equals("#")) && (age == 0) && (weight == 0)){
                break;
            }

            if((age > 17) || (weight >= 80)){
                sb.append(name).append(" ").append("Senior").append("\n");
            }
            else{
                sb.append(name).append(" ").append("Junior").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}