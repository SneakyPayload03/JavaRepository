package Numbers;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean Fart = ShortCircutTestAnd.trueMethod();
        boolean poop = ShortCircutTestAnd.falseMethod();
        if(Fart && poop)
            System.out.println("both are  true");
        if( Fart || poop)
            System.out.println("Only one is true.");
        else
            System.out.println("Both are not true.");

    }
}
