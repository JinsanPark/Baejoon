import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Boolean> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] name = br.lines().toArray(String[]::new);
        int N;
        int M;


        for (int i = 0; i < name.length; i++) {
            map.put(name[i], true);
        }





    }
}
