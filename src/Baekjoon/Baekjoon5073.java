package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //세 변의 길이를 저장할 배열
        int[] arr = new int[3];

        //세 변의 길이를 저장할 집합
        Set<Integer> set = new HashSet<>();

        while(true){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if((n1 == 0) && (n2 == 0) && (n3 == 0)){ //0 0 0 이 들어오면 종료
                break;
            }

            //배열에 세 변 저장
            arr[0] = n1;
            arr[1] = n2;
            arr[2] = n3;

            //배열 정렬
            Arrays.sort(arr);

            if(arr[2] >= (arr[0] + arr[1])){ //가장 긴 변의 길이가 나머지 두 변의 길이보다 크거나 같다면 삼각형 조건 X
                sb.append("Invalid\n");
                continue;
            }

            //집합에 세 변 저장
            set.add(n1);
            set.add(n2);
            set.add(n3);

            if(set.size() == 1){ //집합 크기가 1이라면 세 변의 길이가 같은 것
                sb.append("Equilateral\n");
            }
            else if(set.size() == 2){ //집합 크기가 2라면 두 변의 길이가 같은 것
                sb.append("Isosceles\n");
            }
            else{ //집합 크기가 3이라면 세 변의 길이가 모두 다른 것
               sb.append("Scalene\n");
            }

            set.clear(); //집합 초기화

        }

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}