import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //소수찾기
        //입력 받을 개수인 N을 입력받고, N개 만큼 입력
        // 소수는 1과 자기 자신으로만 나누어지는 수
        // 1부터 자기 자신까지 1씩 증가하면서 for문 돌리기.
        // 그중 1과 자기 자신으로 만 나눠지는 수만 카운트해서 저장하고 출력하기.
        
        //수정할점. 소수의 정의를 다시 생각해보면. 1과 자기자신으로만 나눠지는수. 즉 나눠진 횟수가 2인 값만 찾으면됨.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int num = 0;

        for (int y = 0; y < N; y++) {

            int pnum = sc.nextInt();
            int count = 0;

            for (int i = 1; i <= pnum; i++) {

                if (pnum == 1) {
                    continue;
                } else if (pnum % i == 0) {
                    count++;
                }

            }

            if (count == 2) {
                num++;
            }

        }

        System.out.println(num);

    }
}