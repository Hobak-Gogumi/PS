package Baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            int item;
            switch(str){
                case "push_front":
                    item = Integer.parseInt(st.nextToken());
                    deque.addFirst(item);
                    break;
                case "push_back":
                    item = Integer.parseInt(st.nextToken());
                    deque.addLast(item);
                    break;
                case "pop_front":
                    if(deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.removeFirst()).append("\n");
                    break;
                case "pop_back":
                    if(deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.removeLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front":
                    if(deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.getFirst()).append("\n");
                    break;
                case "back":
                    if(deque.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deque.getLast()).append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}