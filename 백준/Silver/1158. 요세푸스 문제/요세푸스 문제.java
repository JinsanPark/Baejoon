import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        Node head = new Node(1);
        Node cursor = head;

        for (int i = 2; i <= N; i++) {

            Node newNode = new Node(i);

            cursor.next = newNode;
            newNode.prev = cursor;

            cursor = newNode;

        }

        cursor.next = head;
        head.prev = cursor;

        sb.append("<");

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < K; j++) {
                cursor = cursor.next;
            }

            if (i == N - 1) {
                sb.append(cursor.data);
            } else {
                sb.append(cursor.data).append(", ");
            }

            cursor.prev.next = cursor.next;
            cursor.next.prev = cursor.prev;
            cursor = cursor.prev;
        }

        sb.append(">");

        System.out.println(sb);

    }

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

    }

}