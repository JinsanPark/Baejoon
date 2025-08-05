import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
        //M입력 그 다음줄 N 입력 M <= N이여야함.
        //M부터 N사이의 수에서 소수를 찾는 로직을 짜야함.
        // count 선언
        //1부터 N까지 나누면서 나눠지면 (% == 0) count++ 하고 count가 2인 수만 모아서 합치고, 최소값 선언후 따로 빼기
        // 소수가 없으면 -1출력
        //그리고 출력하기

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        int sum = 0;
        int minPrime = -1;

        for (int i = M; i <= N; i++) {

            if ( i == 1) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                sum += i;

                if (minPrime == -1)
                minPrime = i;
            }


        }

        if (sum == 0) {
            System.out.println(minPrime);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);

        }

    }
}