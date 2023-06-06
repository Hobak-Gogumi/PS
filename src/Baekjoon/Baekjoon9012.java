package Baekjoon;

import java.io.*;
import java.util.Stack;

public class Baekjoon9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String str = br.readLine();

            if(VPS(str))
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }

        bw.flush();
        bw.close();
    }

    //VPS면 true를 반환하고, 아니면 false를 반환하는 메서드 작성
    static boolean VPS(String str){
        if((str.length() % 2) == 1) //문자열 길이가 홀수면 VPS가 무조건 될 수 없음
            return false;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else if(str.charAt(i) == ')'){
                if(stack.isEmpty())  //만약 스택이 비어있으면 짝이 맞는 여는 괄호가 없다는 뜻.
                    return false;
                else
                    stack.pop();
            }
        }

        if(!stack.isEmpty()) //문자열을 다 탐색했는데도 stack에 남아있으면 VPS가 아니다.
            return false;
        else //스택이 비어있으면 VPS
            return true;
    }
}