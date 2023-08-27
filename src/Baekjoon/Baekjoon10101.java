package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //세 각 입력받기. 합 구하기
        int[] arr = new int[3];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            int angle = Integer.parseInt(br.readLine());

            arr[i] = angle;
            sum += angle;
        }

        //정렬
        Arrays.sort(arr);

        //검사
        int sameCount = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1])
                sameCount++;
        }

        if(sum != 180){
            bw.write("Error");
        }
        else{
            if(sameCount == 2)
                bw.write("Equilateral");
            else if(sameCount == 1)
                bw.write("Isosceles");
            else
                bw.write("Scalene");
        }

        bw.flush();
        bw.close();
    }

}