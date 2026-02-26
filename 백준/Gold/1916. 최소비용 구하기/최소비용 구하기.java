import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        PriorityQueue<Bus> pq = new PriorityQueue<>((a,b) -> a.price - b.price);
        StringTokenizer st;

        ArrayList<ArrayList<Bus>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<Bus>());
        }

        int[] array = new int[N + 1];

        for (int i = 1; i <= N ; i++) {
            array[i] = Integer.MAX_VALUE;
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int dep = Integer.parseInt(st.nextToken());
            int arr = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());

            list.get(dep).add(new Bus(dep,arr,price));

        }

        st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        pq.offer(new Bus(start, start, 0));
        array[start] = 0;

        while (!pq.isEmpty()) {

            Bus cur = pq.poll();

            if (cur.price > array[cur.arr]) {
                continue;
            }


            for (Bus nextBus : list.get(cur.arr)) {


                if (cur.price + nextBus.price < array[nextBus.arr]) {
                    array[nextBus.arr] = cur.price + nextBus.price;
                    pq.offer(new Bus(nextBus.dep, nextBus.arr, array[nextBus.arr]));
                }
            }

        }

        System.out.println(array[end]);

    }

    static class Bus {

        int dep;
        int arr;
        int price;

        Bus(int dep, int arr,int price) {
            this.dep = dep;
            this.arr = arr;
            this.price = price;

        }

    }


}