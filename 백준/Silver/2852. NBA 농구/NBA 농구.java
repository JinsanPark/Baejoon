import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int score1 = 0;
        int score2 = 0;
        int winningTime1 = 0;
        int winningTime2 = 0;
        int previousTime = 0;


        for (int i = 0; i < N; i++) {
            String[] teamNum = br.readLine().split(" ");

            String goalTeam = teamNum[0];
            String goalTime = teamNum[1];

            String[] time = goalTime.split(":");

            int min = Integer.parseInt(time[0]);
            int sec = Integer.parseInt(time[1]);
            int currentTime = min * 60 + sec;

            int timeDiff = currentTime - previousTime;

            if(score1 > score2) {
                winningTime1 += timeDiff;
            } else if(score2 > score1) {
                winningTime2 += timeDiff;
            }


            if (teamNum[0].equals("1")) {
                score1 += 1;
            } else if (teamNum[0].equals("2")) {
                score2 += 1;
            }
            previousTime = currentTime;
        }
        int currentTime = 48 * 60;

        if (score1 > score2) {

            int timeDiff = currentTime - previousTime;
            winningTime1 += timeDiff;

        } else if (score2 > score1) {
            int timeDiff = currentTime - previousTime;
            winningTime2 += timeDiff;
        }

        System.out.printf("%02d:%02d\n", winningTime1 / 60, winningTime1 % 60);
        System.out.printf("%02d:%02d\n", winningTime2 / 60, winningTime2 % 60);

    }
}