import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = str.length();
        int M = Integer.parseInt(br.readLine());
        Node head = new Node('?');
        Node cursor = head;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            Node newNode = new Node(str.charAt(i));

            newNode.prev = cursor;
            newNode.next = cursor.next;

            if (cursor.next != null) {
                cursor.next.prev = newNode;
            }

            cursor.next = newNode;
            cursor = newNode;

        }


        for (int i = 0; i < M; i++) {

            String[] inputs = br.readLine().split(" ");
            String cmd = inputs[0];

            if (cmd.equals("P")) {

                //input[1]을 커서 왼쪽에 추가하는 로직
                Node newInput = new Node(inputs[1].charAt(0));
                newInput.prev = cursor;
                newInput.next = cursor.next;

                if (cursor.next != null) {
                    cursor.next.prev = newInput;
                }

                cursor.next = newInput;
                cursor = newInput;


            } else if (cmd.equals("L")) {

                //커서 왼쪽으로 한칸 움직이는 로직
                if (cursor.prev != null) {
                    cursor = cursor.prev;
                }

            } else if (cmd.equals("D")) {

                //커서 오른쪽으로 한칸 움직이는 로직
                if (cursor.next != null) {
                    cursor = cursor.next;
                }

            } else if (cmd.equals("B")) {

                //커서 왼쪽에 있는 문자 삭제하는 로직.
                if (cursor != head) {
                    cursor.prev.next = cursor.next;

                    if (cursor.next != null) {
                        cursor.next.prev = cursor.prev;
                    }

                    cursor = cursor.prev;

                }
            }
        }

        Node temp = head.next;

        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }

        System.out.println(sb.toString());

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