import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        int count = 0;
        int stick = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            stack.push(a);
        }

        while (!stack.isEmpty()) {

            int a = stack.pop();

            if (a > stick) {
                stick = a;
                count++;
            }

        }

        System.out.println(count);

    }
}