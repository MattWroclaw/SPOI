import java.util.Scanner;

public class Prime_T {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

//        if (N<1 ||N>10000){return;}


        for (int i = 0; i < N; i++) {
            System.out.println(checkPrime(in.nextInt()));

        }
    }

    static String checkPrime(int numberToCheck) {
        if (numberToCheck < 2) {
          return   "NIE";
        } else {
            for (int i = 2; i < numberToCheck; i++) {
                if (numberToCheck % i == 0) {
                  return   "NIE";
                }
            }

          return   "TAK";
        }

    }
}
