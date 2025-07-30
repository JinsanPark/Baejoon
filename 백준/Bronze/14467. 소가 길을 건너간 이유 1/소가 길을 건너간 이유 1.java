import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //HashMap에 소와 소의 위치를 저장, 관찰횟수는 N < 100
        // 반복문으로 N번까지 돌리고, 소의 번호와 위치를 입략
        //입력받은 값을 저장
        //같은소의 위치값이 바뀌면 길을 건넌것으로 계산 - 위치값이 바뀐 소만 따로 계산하면 되지 않을까?
        //

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int crossRoadCount = 0;
        HashMap<Integer, Integer> cowMap = new HashMap<>();

    //HashMap get = key를 이용해 value를 가져온다 cowMap.get(location) != location 이런거 안됨

        for (int i = 0; i < N; i++) {

            int cowNum = sc.nextInt();
            int location = sc.nextInt();

            if (cowMap.containsKey(cowNum) == false) {

                cowMap.put(cowNum, location);
            } else if (cowMap.get(cowNum) != location) {

                crossRoadCount++;
                cowMap.put(cowNum, location);

            }



        }

        System.out.println(crossRoadCount);

    }
}