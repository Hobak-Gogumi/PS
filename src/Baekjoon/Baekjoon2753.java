package Baekjoon;

import java.util.Scanner;

public class Baekjoon2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(y % 400 == 0){
            System.out.println(1);
        } else if((y % 4 == 0) && (y % 100 != 0)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

        sc.close();
    }

}
