import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int firstMove = Integer.parseInt(st.nextToken());
        Node firstNode = new Node(1,firstMove);
        Node lastNode = firstNode;

        for (int i = 2; i <= N; i++) {
            int move = Integer.parseInt(st.nextToken());
            Node newNode = new Node(i,move);

            lastNode.next = newNode;
            newNode.prev = lastNode;

            lastNode = newNode;
        }

        lastNode.next = firstNode;
        firstNode.prev = lastNode;

        Node cursor = firstNode;

        for (int i = 0; i < N; i++) {
            sb.append(cursor.index).append(" ");

            int moveValue = cursor.move;

            if (N > 1) {
                cursor.prev.next = cursor.next;
                cursor.next.prev = cursor.prev;
            }

            if (i == N - 1) break;

            Node temp = cursor;

            if (moveValue > 0) {
                temp = temp.next;
                for (int j = 0; j < moveValue - 1; j++) {
                    temp = temp.next;
                }
            } else {
                temp = cursor;
                for (int j = 0; j < Math.abs(moveValue); j++) {
                    temp = temp.prev;
                }
            }

            cursor = temp;
        }
        System.out.println(sb);

    }

    static class Node {

        Node prev;
        Node next;
        int move;
        int index;

        Node(int index, int move) {
            this.index = index;
            this.move = move;
        }

    }

}