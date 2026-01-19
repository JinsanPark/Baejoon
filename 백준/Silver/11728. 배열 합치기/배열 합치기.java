import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arrN = new int[N];
        int[] arrM = new int[M];
        int pN = 0;
        int pM = 0;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        while (pN < N && pM < M) {

            if (arrN[pN] > arrM[pM]) {
                sb.append(arrM[pM]).append(" ");
                pM++;
            } else {
                sb.append(arrN[pN]).append(" ");
                pN++;
            }

        }

        while (pN < N) {
            sb.append(arrN[pN++]).append(" ");
        }

        while (pM < M) {
            sb.append(arrM[pM++]).append(" ");
        }

        System.out.println(sb);

    }
}