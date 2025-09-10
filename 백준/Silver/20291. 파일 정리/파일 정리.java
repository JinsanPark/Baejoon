import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());



        for (int i = 0; i < n; i++) {

            String name = br.readLine();
            String[] dot = name.split("\\.");
            String afterDot = dot[1];

            map.put(dot[1], map.getOrDefault(afterDot, 0) + 1);

        }

        Set<String> keys = map.keySet();
        ArrayList<String> list = new ArrayList<>(keys);

        Collections.sort(list);
        
        for (String afterDot : list) {

            System.out.println(afterDot + " " + map.get(afterDot));

        }

    }
}