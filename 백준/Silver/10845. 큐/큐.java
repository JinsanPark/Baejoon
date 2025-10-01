import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {


            String[] input = br.readLine().split(" ");

            if (input[0].equals("push")) {

                queue.add(Integer.parseInt(input[1]));

            } else if (input[0].equals("pop")) {

                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.get(0));
                    queue.remove(0);
                }

            } else if (input[0].equals("size")) {

                System.out.println(queue.size());

            } else if (input[0].equals("empty")) {

                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }

            } else if (input[0].equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.get(0));
                }
            } else if (input[0].equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.get(queue.size() - 1));
                }
            }
        }
        
    }
}