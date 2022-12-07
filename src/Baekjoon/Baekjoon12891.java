package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12891 {

    static char[] dna; // DNA 문자열 저장
    static int[] min = new int[4]; // 알파벳 최소 개수 저장
    static int[] count = new  int[4]; // 구간의 알파벳 개수를 카운트할 배열 생성
    static int result = 0; // 조건에 맞는 문자열 발견시 카운트 증가

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        dna = str.toCharArray(); // 크기: S

        st = new StringTokenizer(br.readLine());

        min[0] = Integer.parseInt(st.nextToken()); // A
        min[1] = Integer.parseInt(st.nextToken()); // C
        min[2] = Integer.parseInt(st.nextToken()); // G
        min[3] = Integer.parseInt(st.nextToken()); // T
        //--- 입력 끝

        // 첫 구간의 알파벳 카운트
        // 첫 구간은 더해주고 빼줄게 없으므로 이렇게 계산
        for(int i = 0; i < P; i++){
            AddCount(i);
        }

        CheckCount();

        // 구간을 이동하면서 맨 앞은 빼주고, 추가되는 맨 뒷부분은 더해준다.
        for(int i = 2; i <= S-P+1; i++){
            MinusCount(i-2);
            AddCount(i+P-2);
            CheckCount();
        }

        System.out.println(result);

    }

    static void AddCount(int i){
        if(dna[i] == 'A')
            count[0]++;
        else if(dna[i] == 'C')
            count[1]++;
        else if(dna[i] == 'G')
            count[2]++;
        else if(dna[i] == 'T')
            count[3]++;
    }

    static void MinusCount(int i){
        if(dna[i] == 'A')
            count[0]--;
        else if(dna[i] == 'C')
            count[1]--;
        else if(dna[i] == 'G')
            count[2]--;
        else if(dna[i] == 'T')
            count[3]--;
    }

    static void CheckCount(){
        if((count[0] >= min[0]) && (count[1] >= min[1]) && (count[2] >= min[2]) && (count[3] >= min[3]))
            result++;
    }

}