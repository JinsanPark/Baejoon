import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static class Team {

        int score = 0;
        int count = 0;
        int fifthPlayer = 0;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] finished = new int[N];
            for (int j = 0; j < N; j++) {
                finished[j] = Integer.parseInt(line[j]);
            }

            HashMap<Integer, Integer> playerCount = new HashMap<>();


            for (int teamNum : finished) {
                int currentCount = playerCount.getOrDefault(teamNum, 0);
                playerCount.put(teamNum, currentCount + 1);
            }

            HashMap<Integer, Team> teamScores = new HashMap<>();
            int currentScore = 1;

            for (int teamNum : finished) {

                if(playerCount.get(teamNum) == 6) {

                    teamScores.putIfAbsent(teamNum, new Team());
                    Team currentTeam = teamScores.get(teamNum);
                    currentTeam.count++;

                    if (currentTeam.count  <= 4) {
                        currentTeam.score += currentScore;
                    } else if (currentTeam.count == 5) {
                        currentTeam.fifthPlayer = currentScore;
                    }
                    currentScore++;
                }
            }

            int winnerTeam = -1;
            int minScore = Integer.MAX_VALUE;
            int minFifthPlayerScore = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Team> entry : teamScores.entrySet()) {
                int currentTeamNumber = entry.getKey();
                Team currentTeam = entry.getValue();

                if (currentTeam.score < minScore) {
                    minScore = currentTeam.score;
                    minFifthPlayerScore = currentTeam.fifthPlayer;
                    winnerTeam = currentTeamNumber;
                } else if (currentTeam.score <= minScore && currentTeam.fifthPlayer <minFifthPlayerScore) {
                    minFifthPlayerScore = currentTeam.fifthPlayer;
                    winnerTeam = currentTeamNumber;
                }

        }
            System.out.println(winnerTeam);
        }



    }

}