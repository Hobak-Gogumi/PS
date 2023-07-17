package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Set<String> set = new HashSet<>();

        //입력
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if(state.equals("enter"))
                set.add(name);
            else if(state.equals("leave"))
                set.remove(name);
        }

        //ArrayList로 변경한 뒤 역순으로 정렬
        ArrayList<String> arraylist = new ArrayList<>(set);
        Collections.sort(arraylist, Collections.reverseOrder());

        //출력
        for(String person: arraylist)
            sb.append(person).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}