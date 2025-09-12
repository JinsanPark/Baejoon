import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] weights = new int[N];
        int[] heigths = new int[N];
        
        
        
        

        for (int i = 0; i < N; i++) {

            String[] wH = br.readLine().split(" ");
            weights[i] = Integer.parseInt(wH[0]);
            heigths[i] = Integer.parseInt(wH[1]);

        }


        for (int i = 0; i < N; i++) {

            int bigger = 0;

            for (int j = 0; j < N; j++) {

                if (weights[j] > weights[i] && heigths[j] > heigths[i]) {
                    bigger++;
                }

            }

            System.out.print((bigger + 1) + " ");

        }

    }
}