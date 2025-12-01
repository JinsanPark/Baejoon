import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int newNum = N;
        int sum = 0;
        int l = 0;
        int r = 0;
        String change;

        while (true) {


            if (newNum < 10) {
                change = "" + newNum + newNum;
                newNum = Integer.parseInt(change);
                count++;
            } else {


                sum = newNum/10 + newNum%10;
                l = newNum%10;
                r = sum%10;
                change = "" + l + r;
                newNum = Integer.parseInt(change);
                count++;

            }

            if (newNum == N) {
                break;
            }

        }

        System.out.println(count);

    }
}