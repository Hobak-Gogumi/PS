package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력 받기
        int N = Integer.parseInt(br.readLine());
        Point[] arr = new Point[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Point p = new Point(x, y);
            arr[i] = p;
        }

        //정렬
        Arrays.sort(arr, new Comparator<Point>(){
            @Override
            public int compare(Point p1, Point p2){
                if(p1.x != p2.x)
                    return p1.x - p2.x;
                else //x좌표가 같은 경우
                    return p1.y - p2.y;
            }
        });

        //출력
        for(Point point: arr){
            bw.write(point + "\n");
        }

        bw.flush();
        bw.close();
    }

}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return x + " " + y;
    }
}