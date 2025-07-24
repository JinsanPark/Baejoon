import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // T(1 ≤ T ≤ 20) 까지 입력 받아서 T 만큼 소문자로 이루어진 문장 개수를 받기.
//        암호문을 입력
//        입력받은 암호문에서 빈번한 알파벳을 세기 Hashmap
//        가장 빈번한 암호문 찾기
//        2개 이상이라면 ? 출력하기




        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < T; i++) {
            HashMap<Character, Integer> frequentAlphabet = new HashMap<>();
        String inputPw = scan.nextLine();
        char[] charArray = inputPw.toCharArray();






        for (int j = 0; j < charArray.length; j++) {
            char alphabet = charArray[j];

            if (alphabet == ' ') {
                continue;
            }

            if (frequentAlphabet.containsKey(alphabet)) {
                frequentAlphabet.put(alphabet, frequentAlphabet.get(alphabet) + 1);
            } else {
                frequentAlphabet.put(alphabet,1);
            }
        }


        int mostCountNum = 0;
        char mostCountAlphabet = '?';

        for (Map.Entry<Character, Integer> entry : frequentAlphabet.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();



            if (value > mostCountNum) {
                mostCountNum = value;
                mostCountAlphabet = key;
            } else if (value == mostCountNum) {
                mostCountAlphabet = '?';
            }
            //확인용
            //System.out.println("키: " + key + ", 값: " + value);
        }

        System.out.println(mostCountAlphabet);
        }
    }
}
