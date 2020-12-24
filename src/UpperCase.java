import java.util.Scanner;

public class UpperCase {

    Scanner scn ;
    public UpperCase(){
        scn= new Scanner(System.in);
    }

    public void UpperProggress(){
        String text;
        do{
            System.out.println("\n\nPlease enter text to uppercase first letters of words. Enter empty text to exit:");
            text = scn.nextLine();

            for (String s:text.split(" "))
                if(!s.isBlank())
                    System.out.print( String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1, s.length()) + " ");

        } while(!text.isBlank() );
    }
}
