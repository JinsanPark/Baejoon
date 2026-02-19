import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int start = 0;

        for (int i = 0; i < n; i++) {

            int target = Integer.parseInt(br.readLine());

            if (target > start) {
                for (int j = start + 1; j <= target; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = target;
            }

            if (stack.peek() != target) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");

        }


        System.out.println(sb);

    }
}