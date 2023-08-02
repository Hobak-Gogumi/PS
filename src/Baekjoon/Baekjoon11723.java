package Baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if(str.equals("add")){
                int n = Integer.parseInt(st.nextToken());
                set.add(n);
            } else if(str.equals("remove")){
                int n = Integer.parseInt(st.nextToken());
                set.remove(n);
            } else if(str.equals("check")){
                int n = Integer.parseInt(st.nextToken());

                if(set.contains(n))
                    sb.append("1").append("\n");
                else
                    sb.append("0").append("\n");
            } else if(str.equals("toggle")){
                int n = Integer.parseInt(st.nextToken());

                if(set.contains(n))
                    set.remove(n);
                else
                    set.add(n);
            } else if(str.equals("all")){
                set.clear();

                for(int j = 1; j <= 20; j++){
                    set.add(j);
                }
            } else if(str.equals("empty")){
                set.clear();
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}