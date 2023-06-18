package Baekjoon;

import java.io.*;
import java.util.Stack;

public class Baekjoon1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        //입력 받기
        int n = Integer.parseInt(br.readLine());

        int pushNum = 1; //현재 들어와야 할 숫자를 의미
        boolean isAvailable = true; //수열이 가능한 지를 의미하는 변수
        for(int i = 0; i < n; i++){
            int item = Integer.parseInt(br.readLine());

            if(item >= pushNum){ //item을 pop해야 하는데, 아직 item은 스택에 들어있지 않다.
                while(item >= pushNum){
                    stack.push(pushNum);
                    sb.append("+").append("\n");
                    pushNum++;
                }

                stack.pop();
                sb.append("-").append("\n");
            } else if(item < pushNum){ //item을 pop해야 하는데, item은 이미 스택에 있는 상태.
                if(stack.pop() == item){
                    sb.append("-").append("\n");
                } else{
                    isAvailable = false;
                    break;
                }
            }
        }

        if(isAvailable){
            bw.write(sb.toString());
        } else{
            bw.write("NO");
        }

        bw.flush();
        bw.close();

    }

}