package se.lexicon.Model;

public class Scanner {
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static double getUserInput(){
        System.out.println("Enter a number: ");
        return scanner.nextDouble();
    }
}
