import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String numStr = sc.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            char digitChar = numStr.charAt(i);
            sum += digitChar - '0';
        }

        System.out.println(sum);
    }
}