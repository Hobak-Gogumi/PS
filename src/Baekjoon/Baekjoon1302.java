package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();

        //입력
        int N = Integer.parseInt(br.readLine());

        int max = 0; //제일 많이 판매된 갯수를 저장할 변수
        for(int i = 0; i < N; i++){
            String book = br.readLine();
            int count;

            if(!map.containsKey(book))
                count = 0;
            else
                count = map.get(book) + 1;

            map.put(book, count);

            if(count > max)
                max = count;
        }
        //입력 종료

        //맵을 전체탐색 하면서, value가 max값인 경우, key(책 제목)를 List에 넣어줌
        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == max)
                list.add(entry.getKey());
        }

        //정렬
        Collections.sort(list);
        String result = list.get(0); //가장 앞에있는 원소를 출력

        //출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}