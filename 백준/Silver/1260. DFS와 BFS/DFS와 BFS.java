import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int N;
    static int M;
    static int V;

    static int[][] check;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        V = Integer.parseInt(input[2]);

        visited = new boolean[N + 1];
        check = new int[N+1][N+1];

        for (int i = 0; i < M; i++) {

            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            check[a][b] = 1;
            check[b][a] = 1;
        }

        dfs(V);
        System.out.println();
        
        visited = new boolean[N + 1];
        bfs(V);

    }

    public static void dfs(int start) {

        visited[start] = true;
        System.out.print(start + " ");

        for (int i = 1; i <= N; i++) {

            if(check[start][i] == 1 && !visited[i]) {
                dfs(i);
            }


        }

    }
    
    public static void bfs(int start) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            
            int temp = queue.poll();
            System.out.print(temp + " ");
            
            for (int i = 1; i <= N; i++) {
                if(check[temp][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
            
        }
        
    }

}