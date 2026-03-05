import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int[] line = new int[10];

        String sum = String.valueOf(A * B * C);


        for (int i = 0; i < sum.length(); i++) {
            for (int j = 0; j <= 9; j++) {

               if (sum.charAt(i) == (char)(j + '0')) {

                   line[j]++;

               }

            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {

            sb.append(line[i]).append("\n");

        }

        System.out.println(sb);

    }
}