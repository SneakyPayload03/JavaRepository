package LabPractice;

public class Player {
    //Variables
    private int Points = 0;
    private String Name = " ";
    //Methods
    public void setName(String name){
        this.Name = name;
    }
    public String getName(){return this.Name;}
    public void setPoints(int points){this.Points = points;}
    public int getPoints(){return this.Points;}
    //Constructor
    public void Player(String name, int points){
       this.setName(name);
       this.setPoints(points);
    }
}
