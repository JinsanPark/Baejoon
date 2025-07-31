import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //N(배열),M 변수 선언
        //M번 반복 for
        //a b c 입력받기 (만일 a가 1이면  b c는 i x, 234이면 l r)
        // if문으로 a가 1 2 3 4 인지 판단하고 맞는 번호 명령어 실행
        // 1. a == 1 이면 b부터c까지 전구를 c로 변경X b번째 전구를 c로 변경ㅇ
        // 2. a == 2이면  b부터c까지 전구를 반전시킨다. NOT사용하면 될듯?
        // 3. a == 3이면 b부터c까지 전구를 끄고
        // 4. a == 4이면 b부터c까지 전구를 킨다.

        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int M = num.nextInt();
        int[] blubArray = new int[N];

        for (int i = 0; i < N; i++) {
            blubArray[i] = num.nextInt();
        }


        for (int y = 0; y < M; y++) {

            int a = num.nextInt();
            int b = num.nextInt();
            int c = num.nextInt();

            if ( a == 1 ) {
                int i = b;
                int x = c;
                blubArray[i - 1] = x;

            } else if ( a == 2 ) {
                int l = b;
                int r = c;
                for (int i = l; i <= r; i++) {
                    blubArray[i - 1] = 1 - blubArray[i - 1];
                }

            } else if ( a == 3 ) {
                int l = b;
                int r = c;
                for (int i = l; i <= r; i++) {
                    blubArray[i - 1 ] = 0;
                }


            } else if ( a == 4 ) {
                int l = b;
                int r = c;
                for (int i = l; i <= r; i++) {
                    blubArray[i - 1 ] = 1;
                }

            }


        }

        for (int i = 0; i < N; i++) {

            System.out.print(blubArray[i] + " ");
        }

    }
}