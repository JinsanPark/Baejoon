import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] line = new int[n];

        for (int i = 0; i < n; i++) {

            line[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(line);
        int x = Integer.parseInt(br.readLine());
        int count = 0;

        int p1 = 0;
        int p2 = n - 1;

        while (p1 != p2) {

            if (line[p1] + line[p2] == x) {

                count++;
                p1++;

            } else if (line[p1] + line[p2] > x) {
                p2--;
            } else {
                p1++;
            }

        }


        System.out.println(count);

    }
}