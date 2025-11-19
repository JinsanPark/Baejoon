import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNums = br.readLine().split(" ");
        int N = Integer.parseInt(inputNums[0]);
        int M = Integer.parseInt(inputNums[1]);
        int count = 0;

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {

            set.add(br.readLine());

        }

        for (int i = 0; i < M; i++) {

            String input = br.readLine();
            if (set.contains(input)) {
                count++;
            }

        }

        System.out.println(count);

    }
}