package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int item = 0;  //기본 queue 인터페이스는 뒤 원소를 읽는 메서드는 없다. 그러므로 back 명령어가 들어올 때는 마지막에 저장된 원소를 출력해주어야 한다. item 변수가 마지막 저장된 원소를 가질 것이다.
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push":
                    item = Integer.parseInt(st.nextToken());
                    queue.add(item);
                    break;
                case "pop":
                    if(queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.remove() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if(queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.peek() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(item + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }

}
//--- 여기까지 기본 queue 인터페이스를 활용한 풀이

// --- 이 밑은 배열을 활용한 풀이. N입력 받는곳 까지 위방식과 동일하게 진행하고 밑부분만 변경

//    //크기가 N인 배열 생성 (N번 명령 모두 push일 경우 최대 크기)
//    int[] queue = new int[N];
//    int insertIndex = 0;
//    int removeIndex = 0;
//
//    for(int i = 0; i < N; i++){
//        st = new StringTokenizer(br.readLine());
//
//        switch(st.nextToken()){
//            case "push":
//            queue[insertIndex] = Integer.parseInt(st.nextToken());
//            insertIndex++;
//            break;
//            case "pop":
//            if(insertIndex == removeIndex)
//            bw.write("-1\n");
//            else{
//            bw.write(queue[removeIndex] + "\n");
//            removeIndex++;
//            }
//            break;
//            case "size":
//            bw.write(insertIndex - removeIndex + "\n");
//            break;
//            case "empty":
//            if(insertIndex == removeIndex)
//            bw.write("1\n");
//            else
//            bw.write("0\n");
//            break;
//            case "front":
//            if(insertIndex == removeIndex)
//            bw.write("-1\n");
//            else
//            bw.write(queue[removeIndex] + "\n");
//            break;
//            case "back":
//            if(insertIndex == removeIndex)
//            bw.write("-1\n");
//            else
//            bw.write(queue[insertIndex - 1] + "\n");
//            break;
//        }
//    }