import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {

                int absA = Math.abs(a);
                int absB = Math.abs(b);

                if (absA == absB) {
                    return a - b;
                } else {
                    return absA - absB;
                }

            }

        });
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if ( x != 0) {
                pq.add(x);
            } else {

                if(pq.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(pq.poll()).append('\n');
                }

            }
        }
        br.close();
        System.out.println(sb);
    }
}