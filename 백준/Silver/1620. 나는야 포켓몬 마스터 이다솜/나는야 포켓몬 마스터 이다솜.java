import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputNums[] = br.readLine().split(" ");
        int N = Integer.parseInt(inputNums[0]);
        int M = Integer.parseInt(inputNums[1]);

        ArrayList<String> arrPokemon = new ArrayList();
        ArrayList<String> arrAnswer = new ArrayList();
        HashMap<String, Integer> mapPokemon = new HashMap();

        for (int i = 0; i < N; i++) {

            String input = br.readLine();
            arrPokemon.add(input);
            mapPokemon.put(input, i + 1);

        }

        for (int i = 0; i < M; i++) {

            String input = br.readLine();

            if (isNumber(input)) {
                int number = Integer.parseInt(input);
                arrAnswer.add(arrPokemon.get(number - 1));
            } else if (mapPokemon.containsKey(input)) {
                arrAnswer.add(String.valueOf(mapPokemon.get(input)));

            }

        }

        for (int i = 0; i < M; i++) {
            System.out.println(arrAnswer.get(i));
        }

    }

    public static boolean isNumber(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }



}