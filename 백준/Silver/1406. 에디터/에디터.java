import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();

        for (char c : line.toCharArray()) {
            list.add(c);
        }


        ListIterator<Character> iter = list.listIterator(list.size());

        for (int i = 0; i < M; i++) {

            String cmd = br.readLine();
            char c = cmd.charAt(0);

           if (c == 'L') {
               if (iter.hasPrevious()) {
                   iter.previous();
               }
           } else if (c == 'D') {
               if (iter.hasNext()) {
                   iter.next();
               }
           } else if (c == 'B') {
               if (iter.hasPrevious()) {
                   iter.previous();
                   iter.remove();
               }
           } else if (c == 'P') {
               char t = cmd.charAt(2);
               iter.add(t);
           }
        }

        for (char ch : list) {
            sb.append(ch);
        }

        System.out.println(sb);

    }
}