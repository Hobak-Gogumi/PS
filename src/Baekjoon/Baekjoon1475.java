package Baekjoon;

import java.io.*;

public class Baekjoon1475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String roomNum = br.readLine();

        int[] arr = new int[9]; //인덱스 0부터 8까지 쓴다.

        //숫자 등장하는 개수 카운트
        for(int i = 0; i < roomNum.length(); i++){
            if(roomNum.charAt(i) == '9') //9일 경우 6을 증가시킨다. (같이 사용할 수 있음)
                arr[6]++;
            else
                arr[roomNum.charAt(i) - '0']++;
        }

        //예를들어 6의 개수가 7개가 나오면 세트는 총 4세트가 필요함
        if((arr[6] % 2) == 1) //홀수의 경우는 한 번 더 증가시킴
            arr[6] += 1;

        arr[6] = arr[6] / 2;
        //---

        //최대값 구하기
        int maxCount = 0;
        for(int i = 0; i < 9; i++){
            if(arr[i] > maxCount)
                maxCount = arr[i];
        }

        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
    }

}