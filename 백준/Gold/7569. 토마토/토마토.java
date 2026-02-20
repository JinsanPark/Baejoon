import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

   static int[] dx = {-1,1,0,0,0,0};
   static int[] dy = {0,0,-1,1,0,0};
   static int[] dz = {0,0,0,0,-1,1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());  // X축
        int N = Integer.parseInt(st.nextToken());  // Y축
        int H = Integer.parseInt(st.nextToken());  // Z축 높이
        int date = 1;

        int[][][] matrix = new int[H][N][M];
        ArrayDeque<Node> queue = new ArrayDeque<>();

        for (int z = 0; z < H; z++) {
            for (int y = 0; y < N; y++) {

                st = new StringTokenizer(br.readLine());

                for (int x = 0; x < M; x++) {

                    String tomatoes = st.nextToken();
                    matrix[z][y][x] = Integer.parseInt(tomatoes);

                    //만일 1이 들어간다면 큐에 넣기.
                    if (matrix[z][y][x] == 1) {
                        queue.offer(new Node(x,y,z));
                    }

                }
            }
        }

        while (!queue.isEmpty()) {

            Node current = queue.poll();
            int x = current.x;
            int y = current.y;
            int z = current.z;


            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && nz >= 0 && nz < H &&matrix[nz][ny][nx] == 0) {
                    queue.offer(new Node(nx,ny,nz));
                    matrix[nz][ny][nx] = matrix[z][y][x] + 1;
                }

            }

        }

        for (int z = 0; z < H; z++) {
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {

                    if (matrix[z][y][x] > date) {
                        date = matrix[z][y][x];
                    }

                    if (matrix[z][y][x] == 0) {
                        System.out.println(-1);
                        return;
                    }

                }
            }
        }

        System.out.println(date - 1);

    }

    public static class Node{

        int x;
        int y;
        int z;

        public Node(int x, int y,int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

    }

}