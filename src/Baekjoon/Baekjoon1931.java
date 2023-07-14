package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        int N = Integer.parseInt(br.readLine()); //회의의 수
        Meeting[] arr = new Meeting[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[i] = new Meeting(s, e);
        }
        //입력 종료

        //종료 시간을 기준으로 배열을 정렬하기
        //만약 종교 시간이 같다면 시작 시간이 빠른대로 정렬
        Arrays.sort(arr, new Comparator<Meeting>(){
            @Override
            public int compare(Meeting m1, Meeting m2){
                if(m1.endTime == m2.endTime)
                    return m1.startTime - m2.startTime;
                else
                    return m1.endTime - m2.endTime;
            }
        });


        int count = 1; //가장 빨리 끝나는 회의를 미리 카운트 함
        int t = arr[0].endTime;
        for(int i = 1; i < N; i++){      //이미 인덱스 0인 회의를 카운팅 한거니까, 탐색도 0 다음 1부터 해야한다.
            if(arr[i].startTime >= t){
                count++;
                t = arr[i].endTime;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();

    }

}

class Meeting{
    int startTime;
    int endTime;

    public Meeting(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
}