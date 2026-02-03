import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());



        for (int i = 0; i < n; i++) {

            Node head = new Node('?');
            Node cursor = head;

            String inputs = br.readLine();

            for (int j = 0; j < inputs.length(); j++) {

                char c = inputs.charAt(j);

                if (c == '<') {

                    if (cursor != head) {
                        cursor = cursor.prev;
                    }

                } else if (c == '>') {
                    if (cursor.next != null) {
                        cursor = cursor.next;
                    }
                } else if (c == '-') {
                    if (cursor != head) {
                        cursor.prev.next = cursor.next;

                        if (cursor.next != null) {
                            cursor.next.prev = cursor.prev;
                        }

                        cursor = cursor.prev;

                    }
                } else {

                    Node newNode = new Node(inputs.charAt(j));

                    newNode.prev = cursor;
                    newNode.next = cursor.next;

                    if (cursor.next != null){

                        cursor.next.prev = newNode;

                    }

                    cursor.next = newNode;
                    cursor = newNode;

                }
            }

            StringBuilder sb = new StringBuilder();
            Node temp = head.next;
            while (temp != null) {
                sb.append(temp.data);
                temp = temp.next;
            }
            
            System.out.println(sb);

        }


    }

    static class Node {

        char data;
        Node next;
        Node prev;

        Node(char data) {
            this.data = data;
        }

    }

}