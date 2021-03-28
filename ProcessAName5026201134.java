import java.util.Scanner;

public class ProcessAName5026201134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = sc.nextLine();
        int spcIndex = name.indexOf(" ");
        String firstName = name.substring(0, spcIndex);
        String lastName = name.substring((spcIndex+1), name.length());

        System.out.println("Your name is: " + lastName + ", " + firstName.substring(0,1));
    }
}
