import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);
        br.close();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {

            queue.poll();
            int i = queue.poll();
            queue.add(i);

        }

        System.out.println(queue.poll());


    }


}