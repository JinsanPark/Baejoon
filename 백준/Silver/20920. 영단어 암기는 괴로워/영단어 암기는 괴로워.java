import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }


        ArrayList<String> words = new ArrayList<>(map.keySet());

        words.sort((word0, word1) -> {

            int freq = map.get(word1).compareTo(map.get(word0));
            if (freq != 0) {
                return freq;
            }

            int length = Integer.compare(word1.length(), word0.length());
            if (length != 0) {
                return length;
            }

            return word0.compareTo(word1);
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String word : words) {
            bw.write(word + "\n");
        }
        bw.flush();
        bw.close();


    }
}