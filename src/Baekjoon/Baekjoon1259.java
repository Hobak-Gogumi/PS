package Baekjoon;

import java.io.*;

public class Baekjoon1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for( ; ; ){
            String str = br.readLine();
            if(str.equals("0"))
                break;

            int start = 0;
            int end = str.length() - 1;
            String ans = "yes";

            while(start < end){
                if(str.charAt(start) == str.charAt(end)){
                    start++;
                    end--;
                } else{
                    ans = "no";
                    break;
                }
            }

            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
    }

}
