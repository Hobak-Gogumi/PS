package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); //가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수

        int[] arr = new int[K];
        int max = 0; //최댓값 저장 변수
        //랜선 길이 입력받으면서 최댓값 구하기
        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());

            if(arr[i] > max)
                max = arr[i];
        }

        long start = 1;
        long end = max;
        long mid;
        long sum; //총 랜선이 몇개 잘리는지 계산
        long result = 0;
        while(start <= end){
            sum = 0;
            mid = (start + end) / 2;

            for(int a : arr){
                sum += a / mid;
            }

            if(sum >= N){  //현재 mid 길이만큼 잘라서 나온 랜선의 총 개수가 N보다 많으면, 최대 랜선의 길이를 구해야 하므로 랜선 길이를 더 늘려서 계산해준다.
                result = mid; //현재 mid값이 정답일 수도 있으므로 값을 저장해 둠. (향후 탐색에서 만족하는 길이가 안 나올수도 있음)
                start = mid + 1;
            } else if(sum < N){ //현재 mid 길이만큼 잘라서 나온 랜선의 총 개수가 N보다 작으면, 더 작은 길이로 잘라서 랜선 개수를 늘려줘야함.
                end = mid - 1;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();

    }

}