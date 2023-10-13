package Baekjoon;

import java.io.*;

public class Baekjoon10886 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int notCute = 0;
        int cute = 0;
        for(int i = 0; i < N; i++){
            String input = br.readLine();

            if(input.equals("0")){
                notCute++;
            }
            else if(input.equals("1")){
                cute++;
            }
        }

        if(notCute > cute){
            bw.write("Junhee is not cute!");
        }
        else if(cute > notCute){
            bw.write("Junhee is cute!");
        }

        bw.flush();
        bw.close();
    }

}