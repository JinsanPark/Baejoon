import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;


        for (int i = 0; i < N; i++) {

            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < input.length(); j++) {

                char ch = input.charAt(j);

                if (stack.isEmpty() || stack.peek() != ch) {
                    stack.push(ch);
                } else if (stack.peek() == ch) {
                    stack.pop();
                }

            }


            if (stack.isEmpty()) {
                count++;
            }


        }

        System.out.println(count);

    }
}