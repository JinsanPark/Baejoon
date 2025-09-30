import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {

        String[] input = br.readLine().split(" ");
        String order = input[0];

        if (order.equals("push")) {

            int number = Integer.parseInt(input[1]);
            stack.add(number);

        } else if (order.equals("pop")) {

            if(stack.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(stack.remove(stack.size() - 1));
            }

        } else if (order.equals("size")) {

            System.out.println(stack.size());

        } else if (order.equals("top")) {

            if(stack.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(stack.get(stack.size() - 1));
            }

        } else if (order.equals("empty")) {
            if(stack.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
        
        }

    }
}