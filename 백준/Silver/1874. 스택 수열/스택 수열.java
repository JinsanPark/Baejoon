import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        n = Integer.parseInt(input);
        Deque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean isPossible = true;

        for (int i = 1; i <= n; i++) {

            String inputs = br.readLine();
            int num = Integer.parseInt(inputs);
            list.add(num);

        }

        int currentNum = 1;

        for (int targetNum : list) {

            while (currentNum <= targetNum) {
                stack.push(currentNum);
                currentNum++;
                sb.append("+\n");
            }

            if (stack.peek()  == targetNum) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
            }
        }

        if (isPossible == false) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }

    }
}