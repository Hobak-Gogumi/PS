package Baekjoon;

import java.io.*;

public class Baekjoon2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int len = str.length();
        int count = 0;
        int index = 0;
        while(index < len){
            if((index < (len - 2)) && (str.charAt(index) == 'd') && (str.charAt(index+1) == 'z') && (str.charAt(index+2) == '=')){
                index+=3;
            } else if((index < (len - 1)) && (str.charAt(index) == 'c') && (str.charAt(index+1) == '=')){
                index+=2;
            } else if((index < (len - 1)) && (str.charAt(index) == 'c') && (str.charAt(index+1) == '-')){
                index+=2;
            } else if((index < (len - 1)) && (str.charAt(index) == 'd') && (str.charAt(index+1) == '-')){
                index+=2;
            } else if((index < (len - 1)) && (str.charAt(index) == 'l') && (str.charAt(index+1) == 'j')){
                index+=2;
            } else if((index < (len - 1)) && (str.charAt(index) == 'n') && (str.charAt(index+1) == 'j')){
                index+=2;
            } else if((index < (len - 1)) && (str.charAt(index) == 's') && (str.charAt(index+1) == '=')){
                index+=2;
            } else if((index < (len - 1)) && (str.charAt(index) == 'z') && (str.charAt(index+1) == '=')){
                index+=2;
            } else{
                index+=1;
            }

            count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}