import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int oddCount = 0;


        for (int i = 0; i < name.length(); i++) {

            map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);

        }

        for (int count : map.values()) {

            if (count % 2 != 0) {
                oddCount++;
            }

        }

        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }


        StringBuilder front = new StringBuilder();
        String middle = "";

        for (char c = 'A'; c <= 'Z'; c++) {

            if (map.containsKey(c)) {

                int count = map.get(c);

                if (count % 2 != 0) {
                    middle = String.valueOf(c);

                }

                for (int i = 0; i < count / 2; i++) {
                    front.append(c);
                }

            }

        }
        String rear = new StringBuilder(front).reverse().toString();
        System.out.println(front + middle + rear);
    }
}
