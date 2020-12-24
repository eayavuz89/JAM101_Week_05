public class Write0_100Numbers {
    public Write0_100Numbers(){
        for (int i = 1 ; i <=100 ; i++ ) {
            System.out.print(i - 1);
            System.out.print(i % 10 == 0  ? "\n" : ",");
        }
    }
}
