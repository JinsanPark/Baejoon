import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] playerNumAndRoomCount = br.readLine().split(" ");

        int p = Integer.parseInt(playerNumAndRoomCount[0]);
        int m = Integer.parseInt(playerNumAndRoomCount[1]);

        ArrayList<Room> rooms = new ArrayList<>();

        for (int i = 0; i < p; i++) {

            String[] PlayerNameAndLevel = br.readLine().split(" ");
            int l = Integer.parseInt(PlayerNameAndLevel[0]);
            String n = PlayerNameAndLevel[1];
            Player newPlayer = new Player(l, n);

            boolean entered = false;

            for (Room room : rooms) {

                if (!room.isFull() && room.canEnter(newPlayer)) {
                    room.players.add(newPlayer);
                    entered = true;
                    break;
                }
            }

            if(!entered) {

                Room newRoow = new Room(newPlayer, m);
                rooms.add(newRoow);

            }

        }

        for (Room room : rooms) {
            if (room.isFull()) {
                System.out.println("Started!");
            } else {
                System.out.println("Waiting!");
            }

            Collections.sort(room.players, (p1, p2) -> p1.n.compareTo(p2.n));

            for (Player player : room.players) {
                System.out.println(player.l + " " + player.n);
            }
            
        }


    }

   static class Player {
        int l;
        String n;

        public Player(int l, String n) {
            this.l = l;
            this.n = n;
        }
    }

    static class Room {
        int levelMin;
        int levelMax;
        int playerCount;
        ArrayList<Player> players;

        public Room(Player firstPlayer, int m) {
            this.levelMin = firstPlayer.l - 10;
            this.levelMax = firstPlayer.l + 10;
            this.playerCount = m;
            this.players = new ArrayList<>();
            this.players.add(firstPlayer);
        }


        public boolean isFull() {
            if (this.players.size() == this.playerCount) {
                return true;
            }
            return false;
        }

        public boolean canEnter(Player player) {
            if (player.l >= this.levelMin && player.l <= this.levelMax) {
                return true;
            }
            return false;
        }

    }
}