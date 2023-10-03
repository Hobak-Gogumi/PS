package Baekjoon;

import java.io.*;

public class Baekjoon1264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = br.readLine();

            if(input.equals("#")){
                break;
            }

            int count = 0;
            for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);

                switch(c){
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'O':
                    case 'o':
                    case 'U':
                    case 'u':
                        count++;
                        break;
                }
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}