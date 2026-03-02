import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> stack = new ArrayDeque<>();

        String input = br.readLine();
        char[] c = input.toCharArray();

        int count =  0;

        for (int i = 0; i < c.length; i++) {


            if (c[i] == '(') {

                stack.push('(');

            } else {

                stack.pop();

                if (c[i-1] == '(') {

                    count += stack.size();

                } else {

                    count++;

                }
            }
        }

        System.out.println(count);

    }
}