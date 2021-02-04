package StructuresAlgorithms;
import java.util.Scanner;

public class Listing {
    private String name;
    private int age;
    private Listing [] ListingArray = new Listing[3];

    public Listing() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        this.name = in.nextLine();
        System.out.println("Enter an age: ");
        this.age = in.nextInt();
        String age = toString();
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + age);

    }

    public Listing(String name, int age){
        name = this.name;
        age = this.age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + toString());

        }





    public String toString(){
        String age = String.valueOf(this.age);
        return age;
    }
    public void input(){
        int age;
        String name;
        System.out.println("Welcome to The Student Listing");
        System.out.println("Enter Student Name Below: ");


    }
    void setName(String name){
        name = this.name;
    }
    void setAge(int age){
        age = this.age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    void avAge(int age)
    {
        int counter = 0;
        for (Listing i : ListingArray) {
             age = i.getAge() + age;
             System.out.println("Age added");


             counter = counter + 1;
        }
        int ageAveraged = age / counter;
        System.out.println("Average Age = " + ageAveraged);
    }
}
