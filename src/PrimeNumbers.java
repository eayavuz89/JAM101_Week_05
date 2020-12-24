public class PrimeNumbers {
    public PrimeNumbers(){
        for (int i = 1 ; i <100 ; i++ ) {
            boolean exists = false;
            for (int j = 2 ; j <=i/2 && !exists ; j++ )
                exists = i % j == 0 ;

            if(!exists)
                System.out.print(i + ",");
        }
    }
}
