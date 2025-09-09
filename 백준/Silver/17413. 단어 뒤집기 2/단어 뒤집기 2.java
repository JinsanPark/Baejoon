import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean isTag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        int i = 0;
        String input = br.readLine();


        while (i < input.length()) {
            char c = input.charAt(i);

            if (c == '<') {
                isTag = true;
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print("<");

            } else if (c == '>') {
                isTag = false;
                System.out.print(">");
            } else if (c == ' ') {

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");

            } else {

                if (isTag == true) {
                    System.out.print(c);
                } else if (isTag == false) {
                    stack.push(c);
                }

            }
            i++;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}