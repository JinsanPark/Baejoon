import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;
    static int max, min, sum;

    public static void main(String[] args) throws IOException {

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        String[] inputs = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(inputs[i]);

        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st2.nextToken());
        int m = Integer.parseInt(st2.nextToken());
        int mul = Integer.parseInt(st2.nextToken());
        int div = Integer.parseInt(st2.nextToken());

        dfs(1,arr[0],p,m,mul,div);

        System.out.println(max);
        System.out.println(min);


    }

    public static void dfs(int index, int prefix, int plus, int minus, int multiply, int divided) {

        if (index == N) {

            if (prefix < min) {

                min = prefix;

            }

            if (prefix > max) {

                max = prefix;

            }

            return;

        }


        if (plus > 0) {

            dfs(index + 1, prefix + arr[index], plus - 1, minus, multiply, divided);

        }

        if (minus > 0) {

            dfs(index + 1, prefix - arr[index], plus, minus - 1, multiply, divided);

        }

        if (multiply > 0) {

            dfs(index + 1, prefix * arr[index], plus, minus, multiply - 1, divided);

        }

        if (divided > 0) {

            dfs(index + 1, prefix / arr[index], plus, minus, multiply, divided - 1);

        }
    }

}