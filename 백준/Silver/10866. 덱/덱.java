import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //더미
        Node head = new Node(-1);
        Node tail = new Node(-1);
        head.next = tail;
        tail.prev = head;

        int size = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];

            if (cmd.equals("push_front")) {
                int val = Integer.parseInt(input[1]);
                Node newNode = new Node(val);
                Node nextNode = head.next;

                newNode.prev = head;
                newNode.next = nextNode;

                head.next = newNode;
                nextNode.prev = newNode;

                size++;
            } else if (cmd.equals("push_back")) {
                int val = Integer.parseInt(input[1]);
                Node newNode = new Node(val);
                Node prevNode = tail.prev;

                newNode.next = tail;
                newNode.prev = prevNode;

                tail.prev = newNode;
                prevNode.next = newNode;

                size++;

            } else if (cmd.equals("pop_front")) {
                if (size == 0) {
                    sb.append("-1\n");
                } else {

                    Node target = head.next;

                    head.next = target.next;
                    target.next.prev = head;
                    sb.append(target.data).append("\n");

                    size--;
                }
            } else if (cmd.equals("pop_back")) {
                if (size == 0) {
                    sb.append("-1\n");
                } else {

                    Node target = tail.prev;

                    tail.prev = target.prev;
                    target.prev.next = tail;
                    sb.append(target.data).append("\n");

                    size--;
                }
            } else if (cmd.equals("size")) {
                sb.append(size).append("\n");

            } else if (cmd.equals("empty")) {
                sb.append(size == 0 ? 1 : 0).append("\n");

            } else if (cmd.equals("front")) {
                if (size == 0) sb.append("-1\n");
                else sb.append(head.next.data).append("\n");

            } else if (cmd.equals("back")) {
                if (size == 0) sb.append("-1\n");
                else sb.append(tail.prev.data).append("\n");
            }


        }

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