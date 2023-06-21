package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon4673 {

    static boolean arr[];

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        arr = new boolean[10001]; //인덱스 0부터 10000까지 사용가능

        for(int i = 1; i <= 10000; i++){
            if(arr[i]) //boolean값이 true인 경우, 이미 한 수열의 출력값이 됐고, 또 다른 수열의 입력값이 됐으므로(무한수열) pass한다.
                continue;
            else
                D(i);
        }

        for(int i = 1; i <= 10000; i++){
            if(!arr[i]) //false 일 때 셀프넘버
                sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    static void D(int n){
        if(n > 10000)
            return;
        else{
            int num = n;
            int sum = n;

            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }

            if(sum <= 10000){
                arr[sum] = true;
                D(sum); //무한 수열
            }
        }
    }

}