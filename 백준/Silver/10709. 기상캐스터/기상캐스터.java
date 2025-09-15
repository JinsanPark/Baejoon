import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int H = Integer.parseInt(inputs[0]);
        int W = Integer.parseInt(inputs[1]);
        
        char[][] sky = new char[H][W];
        int[][] expecting = new int[H][W];

        for (int i = 0; i < H; i++) {
            sky[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < H; i++) {

            int cloud = -1;

            for (int j = 0; j < W; j++) {

                if (sky[i][j] == 'c') {

                    cloud = j;
                    expecting[i][j] = 0;

                } else if (sky[i][j] == '.') {

                    if (cloud == -1) {
                        expecting[i][j] = -1;
                    } else {
                        expecting[i][j] = j - cloud;
                    }
                }
            }
        }

        for (int i = 0; i < H; i++) {

            for (int j = 0; j < W; j++) {

                System.out.print(expecting[i][j] + " ");

            }
        }
        
    }
}