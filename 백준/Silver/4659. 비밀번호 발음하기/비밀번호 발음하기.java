import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> answers = new ArrayList<>();

            while (true) {
                String pw = br.readLine();

                if (pw.equals("end")) {
                    break;
                }

                if (solve(pw)) {
                    answers.add("<" + pw + "> is acceptable.");
                } else {
                    answers.add("<" + pw + "> is not acceptable.");
                }
            }

            for (String answer : answers) {
                System.out.println(answer);
            }

        }

        static boolean solve(String pw) {

            boolean hasVowel = false;

            for (char letter : pw.toCharArray()) {
                if (isVowel(letter)) {
                    hasVowel = true;
                    break;
                }

            }

            if (!hasVowel) {
                return false;
            }

            for (int i = 0; i < pw.length() - 2; i++) {

                char first = pw.charAt(i);
                char second = pw.charAt(i + 1);
                char third = pw.charAt(i + 2);


                if (isVowel(first) && isVowel(second) && isVowel(third)) {
                    return false;

                } else if (!isVowel(first) && !isVowel(second) && !isVowel(third)) {
                    return false;

                }
            }

            for (int j = 0; j < pw.length() - 1; j++) {

                char current = pw.charAt(j);
                char next = pw.charAt(j + 1);

                if (current == next && current != 'e' && current != 'o') {
                    return false;
                }

            }

            return true;

        }


        static boolean isVowel ( char c){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            } else {
                return false;
            }
        }

}