import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        int count = 0;
        int stick = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            list[i] = a;
        }



        for (int i = N - 1; i >= 0; i--) {

            int a = list[i];

            if (a > stick) {
                stick = a;
                count++;
            }
        }


        System.out.println(count);


    }
}