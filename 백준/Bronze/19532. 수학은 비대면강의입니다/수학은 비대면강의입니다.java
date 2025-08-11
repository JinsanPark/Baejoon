import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //연립방정식 풀면
        // y = (af - dc) / (ae - bd)
        // x = (ce - bf) / (ae - bd)
        // 입력 a b c d e f 입력 받기
        // y 계산후 x식에 y값 대입후에 x값 계산
        // x값 y값 출력할것.


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = (c * e - b * f) / (a * e - b * d);
        int y = (a * f - d * c) / (a * e - b * d);


        System.out.print(x + " " + y);


    }
}