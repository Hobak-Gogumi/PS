package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int index = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push")){
                int item = Integer.parseInt(st.nextToken());
                stack[index] = item;
                index++;
            } else if(str.equals("pop")){
                if(index == 0)
                    System.out.println(-1);
                else{
                    System.out.println(stack[index-1]);
                    index = index - 1;
                }
            } else if(str.equals("size")){
                System.out.println(index);
            } else if(str.equals("empty")){
                if(index == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if(str.equals("top")){
                if(index == 0)
                    System.out.println(-1);
                else
                    System.out.println(stack[index-1]);
            }
        }


    }

}