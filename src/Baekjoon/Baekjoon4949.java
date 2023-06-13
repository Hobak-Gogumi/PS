package Baekjoon;

import java.io.*;
import java.util.Stack;

public class Baekjoon4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String str = br.readLine();

            //온점 하나 들어오면 입력 종료
            if(str.equals("."))
                break;

            if(isBalanced(str))
                bw.write("yes\n");
            else
                bw.write("no\n");

        }

        bw.flush();
        bw.close();
    }

    static boolean isBalanced(String str){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case '(':
                case '[':
                    stack.push(str.charAt(i));
                    break;
                case ')':
                    if((stack.size() == 0) || stack.peek() != '(')
                        return false;
                    else
                        stack.pop();
                    break;
                case ']':
                    if((stack.size() == 0) || stack.peek() != '[')
                        return false;
                    else
                        stack.pop();
                    break;
                default: // []() 말고 다른 문자일 경우 고려하지 않음
                    break;
            }
        }

        if(stack.isEmpty())
            return true;
        else   //문자열을 다 순회하고도 스택이 비어있지 않다면, 짝이 맞지않는 괄호가 남아있다는 뜻
            return false;

    }

}