import java.util.Random;

public class PasswordCreator {
    private final String strings = new String(
            "abcdefghijklmnoprstuvyzxwq"+
            "ABCDEFGHIJKLMNOPRSTUVYZXWQ"+
            "!+%&{[]()=*?-_;,.:<>"
                    );
    Random r;

    public PasswordCreator(){
        r = new Random();

        for (int i = 0 ; i < 50 ; i++) {
            for (int j = 0; j < r.nextInt(8) + 8; j++)
                System.out.print(strings.charAt(r.nextInt( strings.length())));
            System.out.print("\n");
        }
    }
}
