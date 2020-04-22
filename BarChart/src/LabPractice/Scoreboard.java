package LabPractice;

public class Scoreboard {
    Player player = new Player();
    private static int count = 0;

    public void displayPoints(Player player) {
        int points = player.getPoints();
        String name = player.getName();
            System.out.println();
            System.out.print(name);
            System.out.print("     ");
            for (int x = 0; x <= points; x++) {
                if (x > 0) {
                    System.out.print("*");
                }
            }
        }


    public void addPlayer(Player player, String name, int points) {
        player.Player(name, points);
        count = count + 1;
    }

}



