import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> connectedPc;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        connectedPc = new ArrayList<>();

        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            connectedPc.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            connectedPc.get(x).add(y);
            connectedPc.get(y).add(x);

        }


        dfs(1);

        System.out.println(count - 1);

    }

    public static void dfs(int current) {

        visited[current] = true;
        count++;

        for (int next : connectedPc.get(current)) {

            if (!visited[next]) {
                dfs(next);
            }

        }

    }


}