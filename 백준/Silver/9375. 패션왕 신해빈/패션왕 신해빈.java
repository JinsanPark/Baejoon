import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int n = Integer.parseInt(input);


        for (int i = 0; i < n; i++) {


            int result = 1;
            HashMap<String, Integer> map = new HashMap<>();

            String inputs = br.readLine();
            int number = Integer.parseInt(inputs);

            for (int j = 0; j < number; j++) {

                String cloths = br.readLine();
                String key = cloths.split(" ")[1];

                map.merge(key, 1, Integer::sum);

            }



            for (Integer count : map.values()) {

                int current = count + 1;
                result = current * result;
                
            }

            System.out.println(result - 1);

        }

    }
}