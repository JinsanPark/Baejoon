import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            long gcd = getGCD(a, b);
            long lcm = (a * b) / gcd;

            sb.append(lcm).append('\n');

            

        }

        System.out.println(sb);
    }

    public static long getGCD(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}