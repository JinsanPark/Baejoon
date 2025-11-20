import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] inputs = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            int C = Integer.parseInt(inputs[1]);
            String[] inputNums = br.readLine().split(" ");
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();


            for (int i = 0; i < N; i++) {

                int num = Integer.parseInt(inputNums[i]);
                map.put(num, map.getOrDefault(num,0) + 1);

            }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {

                return map.get(j) - map.get(i);

            }
        });


        for (int i = 0; i < list.size(); i++) {

            int key = list.get(i);

            for (int j = 0; j < map.get(key); j++) {

                System.out.print(key + " ");

            }

        }

    }
}