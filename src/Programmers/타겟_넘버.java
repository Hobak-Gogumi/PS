package Programmers;

public class 타겟_넘버 {

    static int count = 0;

    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        return count;
    }

    void DFS(int[] numbers, int target, int index, int sum){
        if(index == numbers.length){
            if(sum == target)
                count++;
            return;
        }

        DFS(numbers, target, index+1, sum + numbers[index]);
        DFS(numbers, target, index+1, sum - numbers[index]);
    }

}