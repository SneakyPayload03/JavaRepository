package LabPractice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scoreboard score = new Scoreboard();
        Player Mandy = new Player();
        Player John = new Player();
        Player Fred = new Player();
        Mandy.setName("Mandy");
        score.addPlayer(Mandy,"Mandy",5);
        score.addPlayer(John,"John",10);
        score.addPlayer(Fred,"John",3);
        score.displayPoints(Mandy);
        score.displayPoints(John);
        score.displayPoints(Fred);
    }
}
