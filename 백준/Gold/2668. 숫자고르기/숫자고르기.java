import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int[] nums;
    static boolean visited[];
    static int N;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nums = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }


        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            dfs(i,i);
        }

        Collections.sort(resultList);
        System.out.println(resultList.size());
        for (int n : resultList) {
            System.out.println(n);
        }

    }

        public static void dfs(int start, int cur) {

            visited[cur] = true;

            int next = nums[cur];

            if (!visited[next]) {
                dfs(start, next);
            } else {
                if (next == start) {
                    resultList.add(start);
                }
            }

        }

}