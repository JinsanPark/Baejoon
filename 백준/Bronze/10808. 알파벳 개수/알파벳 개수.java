import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int[] alp = new int[26];


        for (int i = 0; i < S.length(); i++) {

            char c = S.charAt(i);
            int index = c - 97;

            alp[index]++;

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {

            sb.append(alp[i]).append(" ");

        }

        System.out.println(sb);

    }
}