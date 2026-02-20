import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[N][M];
        ArrayDeque<Node> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {

            String nums = br.readLine();

            for (int j = 0; j < M; j++) {
                int num = Character.getNumericValue(nums.charAt(j));
                matrix[i][j] = num;
            }
        }

        queue.offer(new Node(0, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int x = current.x;
            int y = current.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];


                if (nx >= 0 && nx < N && ny >= 0 && ny < M && matrix[nx][ny] == 1) {
                    queue.offer(new Node(nx,ny));

                    matrix[nx][ny] = matrix[x][y] + 1;
                }
            }
        }

        System.out.println(matrix[N - 1][M - 1]);


    }

    public static class Node{

        int x;
        int y ;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}