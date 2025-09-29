import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] line = new int[N];
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(input[i]);

        }



        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = N; i >= 1; i--) {
            int orderedLine = line[i-1];
            result.add(orderedLine, i);
        }


            for (int person : result) {
                System.out.print(person + " ");
            }


    }
}