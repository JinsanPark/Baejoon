import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {

            int num = Integer.parseInt(st.nextToken());

            list.add(list.size() - num,i);
        }

        for (int line : list) {
            System.out.print(line + " ");
        }

    }
}