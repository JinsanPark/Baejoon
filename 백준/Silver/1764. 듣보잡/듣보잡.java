import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        HashMap<String, Boolean> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] number = br.readLine().split(" ");
        int N = Integer.parseInt(number[0]);
        int M = Integer.parseInt(number[1]);
        ArrayList<String> dbj = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            String newName = br.readLine();
            map.put(newName, true);
        }

        for (int i = 0; i < M; i++){

            String existName = br.readLine();
            if (map.containsKey(existName)){

                dbj.add(existName);

            }

        }

        Collections.sort(dbj);

        System.out.println(dbj.size());
        for (int i = 0; i < dbj.size(); i++){
            System.out.println(dbj.get(i));
        }


    }
}