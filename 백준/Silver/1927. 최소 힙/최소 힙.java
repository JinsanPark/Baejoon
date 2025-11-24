import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        String input = br.readLine();
        int N = Integer.parseInt(input);

        for (int i = 0; i < N; i++) {

            String inputs = br.readLine();
            int x = Integer.parseInt(inputs);

            if(x > 0) {
                pq.add(x);
            } else if (x == 0) {

                if(pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }

            }

        }

    }
}