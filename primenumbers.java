import java.util.Scanner;

public class primenumbers {

    public static void main(String[] args) {

        int start = 2, end = 100, i, n;



        for (i = start; i <= end; i++){

            boolean isPrime = true;

            for (n = 2; n <= (i / 2); n++) {

                if (i % n == 0) {

                    isPrime = false;

                    break;
                }
            }

            if (isPrime){

                System.out.print(i + "-");
            }
        }
    }
}
