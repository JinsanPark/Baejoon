import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {

            String title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);

        }

        int maxCount = 0;
        String bestSeller = "";

        for (String key : map.keySet()) {

            int count = map.get(key);

            if (count > maxCount) {
                maxCount = count;
                bestSeller = key;
            } else if (count == maxCount) {

                if (key.compareTo(bestSeller) < 0) {
                    bestSeller = key;
                }

            }


        }

        System.out.println(bestSeller);

    }
}