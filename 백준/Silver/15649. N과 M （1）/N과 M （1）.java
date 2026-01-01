import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int M,N;
    static boolean visited[];
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        arr = new int[M];


            dfs(0);


    }

    public static void dfs(int depth) {

        if (depth == M) {

            for (int val : arr) {
                System.out.print(val + 1  + " ");
            }

            System.out.println();
            return;

        }

        for (int i = 0; i < N; i++) {

            if (!visited[i]) {
                visited[i] = true;

                arr[depth] = i;

                dfs(depth + 1);

                visited[i] = false;
            }


        }

    }

}