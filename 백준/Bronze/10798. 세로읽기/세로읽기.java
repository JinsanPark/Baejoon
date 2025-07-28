import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //배열에 입력받아 저장
        //가장 긴 단어 찾아서 그 수를 저장 - maxLength
        //세로로 읽기.
        //합치기

        Scanner sc = new Scanner(System.in);
        String[] inputArray = new String[5];
        for (int i = 0; i < 5; i++) {
            inputArray[i] = sc.nextLine();
        }

        String result ="";
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {

            if (inputArray[i].length() > maxLength) {
                maxLength = inputArray[i].length();
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (inputArray[j].length() > i) {
                    char ch = inputArray[j].charAt(i);
                    result += ch;
                }

            }
        }

        System.out.println(result);
    }
}