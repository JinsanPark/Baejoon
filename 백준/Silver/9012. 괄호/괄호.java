import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            ArrayDeque<Character> ad = new ArrayDeque<>();
            String line = br.readLine();
            boolean isTrue = true;

            for (int j = 0; j < line.length(); j++) {

                char c = line.charAt(j);

                if (c == '(') {
                    ad.push(c);
                } else if (c == ')') {
                    if (ad.isEmpty()) {
                        isTrue = false;
                        break;
                    } else {
                        ad.pop();
                    }
                }
            }

            if (!isTrue || !ad.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}