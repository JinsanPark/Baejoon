import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //각수의 자리수?
        //10진법 = 10의 거듭제곱 ex) 1의 자리는 10^0 * 1
        //2진법 = 2의 거듭제곰

        //N 진법일때는 그러면 N의 거듭제곱이 되야겠지? - 1의 자리 N^0 * X 이런 식으로


        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();
        char ch = 'A';
        char num = '0';

        int total = 0;
        
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            hm.put(num,i);
            num = (char)(num + 1);

        }

        for (int i = 10; i < 36; i++) {

            hm.put(ch,i);
            ch = (char)(ch + 1);

        }

        int j = 0;

        for (int i = N.length() - 1; i >= 0  ; i--) {

            int temp = hm.get(N.charAt(i));
            total += temp * Math.pow(B,j);

            j++;

        }

        System.out.println(total);

    }
}