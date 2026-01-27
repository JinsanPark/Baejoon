import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String,String> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String access = st.nextToken();

            if (access.equals("leave")) {
                hm.remove(name);
            } else {
                hm.put(name,access);
            }
        }

        List<String> keyList = new ArrayList<>(hm.keySet());
        keyList.sort(Collections.reverseOrder());

        for (String key : keyList) {
            System.out.println(key);
        }

    }
}