import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] st = new String[5][15];

        for (int i = 0; i < 5; i++) {

            String[] line = br.readLine().split("");

            for (int j = 0; j < line.length; j++) {
                st[i][j] = line[j];
            }

        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                
                if (st[j][i] != null) {
                    sb.append(st[j][i]);
                }

            }
        }

        System.out.println(sb);


    }
}