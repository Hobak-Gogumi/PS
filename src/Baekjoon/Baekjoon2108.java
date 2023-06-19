package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //입력 받기
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>(); //빈도수를 저장할 map 생성
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];

            if(!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
                map.replace(arr[i], map.get(arr[i]) + 1);
        }

        //정렬
        Arrays.sort(arr);

        //1. 산술평균
        //원소들의 총 합을 원소의 개수로 나눔
        int avg = (int)Math.round((sum * 1.0) / n);
        sb.append(avg).append("\n");

        //2. 중앙값
        //정렬 된 배열에서 가장 중앙에 있는 값
        int midVal = arr[n/2];
        sb.append(midVal).append("\n");

        //3. 최빈값
        int maxCount = Collections.max(map.values()); //빈도수 중 가장 큰 값 구하기
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int key : map.keySet()){ //가장 많이 나온 숫자(빈도수가 가장 큰)들을 ArrayList에 더하기
            if(map.get(key) == maxCount)
                arrayList.add(key);
        }

        Collections.sort(arrayList); //정렬

        if(arrayList.size() == 1) //ArrayList의 크기가 1이면, 최빈값이 1개라는 뜻.
            sb.append(arrayList.get(0)).append("\n");
        else if(arrayList.size() >= 2) //ArrayList의 크기가 2이상이면,  최빈값이 2개 이상이라는 뜻. 여러개 있을 경우 두 번째로 작을 값을 출력하랬으므로 인덱스 1을 출력
            sb.append(arrayList.get(1)).append("\n");

        //4. 범위
        //정렬 된 배열에서 가장 큰 값에서 가장 작은 값을 뺀다.
        int range = arr[n-1] - arr[0];
        sb.append(range).append("\n");

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}