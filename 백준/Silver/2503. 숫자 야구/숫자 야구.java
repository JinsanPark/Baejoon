import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ask = new int[N];
        int[] str = new int[N];
        int[] ba = new int[N];

        int count = 0;

        for (int i = 0; i < N; i++) {

            String[] input = br.readLine().split(" ");
            ask[i] = Integer.parseInt(input[0]);
            str[i] = Integer.parseInt(input[1]);
            ba[i] = Integer.parseInt(input[2]);

        }


        for (int i = 123; i <= 987; i++) {

            int i1 = i / 100;
            int i2 = (i / 10) % 10;
            int i3 = i % 10;
            
            if (i2 == 0 || i3 == 0 || i1 == i2 || i1 == i3 || i2 == i3) {
                continue;
            }

            boolean pass = true;

            for (int j = 0; j < N; j++) {
                if (!check(i, ask[j], str[j], ba[j])) {

                    pass = false;
                    break;

                }
            }
            
            if (pass) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean check(int target, int asking, int strike, int ball) {

        int t1 = target / 100;
        int t2 = (target / 10) % 10;
        int t3 = target % 10;

        int a1 = asking / 100;
        int a2 = (asking / 10) % 10;
        int a3 = asking % 10;

        int s = 0;
        int b = 0;


        if (t1 == a1) {
            s++;
        } else if (t1 == a2 || t1 == a3) {
            b++;
        }

        if (t2 == a2) {
            s++;
        } else if (t2 == a1 || t2 == a3) {
            b++;
        }

        if (t3 == a3) {
            s++;
        } else if (t3 == a2 || t3 == a1) {
            b++;
        }

        return s == strike && b == ball;

    }
}