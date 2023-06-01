package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력 받기
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        //정렬
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2); //길이가 같으면 사전순으로
                } else{ //길이가 다르면 짧은것 부터
                    return o1.length() - o2.length();
                }
            }
        });

        //출력(중복 제거)
        bw.write(arr[0] + "\n");
        for(int i = 1; i < N; i++){
            if(arr[i].equals(arr[i-1]))
                continue;
            else
                bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();

    }
}