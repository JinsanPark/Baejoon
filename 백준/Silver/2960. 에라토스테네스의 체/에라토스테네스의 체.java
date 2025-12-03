import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int count = 0;
        int checkNum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 2; i <= N; i++) {
            list.add(i);
        }


        while (list.size() > 0) {

            int P = list.get(0);

            for (int j = 0; j < list.size(); j++) {

                if (list.get(j) % P == 0) {
                    count++;

                    checkNum = list.get(j);

                    if (count == K) {
                        System.out.println(checkNum);
                    }

                    list.remove(j);

                    j--;
                }
            }


        }


    }
}