import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Character,Integer> map = new HashMap<>();
        String word = sc.nextLine();
        word = word.toUpperCase();
        sc.close();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char alphabet = chars[i];

            if (map.containsKey(alphabet)) {
                map.put(alphabet, map.get(alphabet)+ 1);
            } else {
                map.put(alphabet,1);
            }
        }

        int mostCount = 0;
        char mostCountAlphabet = '?';

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value > mostCount) {
                mostCount = value;
                mostCountAlphabet = key;
            }

            else if (value == mostCount) {
                mostCountAlphabet = '?';
            }
        }


        //key값을 출력해야하는거 아닌가?
        System.out.println(mostCountAlphabet);





    }
}