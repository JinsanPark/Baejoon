import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] roomNum = new int[9];

        int setCount = Integer.MIN_VALUE;

        for (int i = 0; i < N.length(); i++) {

            int num = N.charAt(i) - '0';

            if (num == 9) {
                roomNum[6]++;
            } else {
                roomNum[num]++;
            }

        }

        roomNum[6] = roomNum[6] / 2 + roomNum[6] % 2;

        for (int i = 0; i < 9; i++) {

            if (roomNum[i] > setCount) {
                setCount = roomNum[i];
            }
        }

        System.out.println(setCount);

    }
}