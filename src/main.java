
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int chosenOption;
        do{
            System.out.println("\n\nPlease select what you want:\n1- UpperCase\n2- Write 0-100 numbers\n3- 0-100 Prime numbers\n4- Password creator\n5- Char pattern\n0- Exit");
            chosenOption = scn.nextInt();
            switch (chosenOption){
                case 1:
                    new UpperCase().UpperProggress();
                    break;
                case 2:
                    new Write0_100Numbers();
                    break;
                case 3:
                    new PrimeNumbers();
                    break;
                case 4:
                    new PasswordCreator();
                    break;
                case 5:
                    new CharPattern();
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Please enter between 0-5 values");
                    break;
            }
        }while(chosenOption != 0 );
    }
}
