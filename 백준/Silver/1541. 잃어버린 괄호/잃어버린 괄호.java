import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("-");

        int total = 0;

        for (int i = 0; i < input.length; i++) {

            String group = input[i];
            int tempSum = 0;

            String[] groupSplit = input[i].split("\\+");

            for (int j = 0; j < groupSplit.length; j++) {

                int x = Integer.parseInt(groupSplit[j]);
                tempSum += x;

            }

            if (i == 0) {
                total += tempSum;
            } else {
                total -= tempSum;
            }
        }

        System.out.println(total);


    }
}