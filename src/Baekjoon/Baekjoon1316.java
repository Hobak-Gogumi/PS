package Baekjoon;

import java.io.*;

public class Baekjoon1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            boolean[] arr = new boolean[26];

            boolean ans = true;
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(arr[c-'a'] == false){
                    arr[c-'a'] = true;
                } else if((arr[c-'a'] == true) && (c == str.charAt(j-1))){
                    arr[c-'a'] = true;
                } else if((arr[c-'a'] == true) && (c != str.charAt(j-1))){
                    ans = false;
                    break;
                }
            }

            if(ans == true)
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}