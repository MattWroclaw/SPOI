import java.util.Scanner;

public class LiczbyPierwsze {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Do jakiej liczby chcesz sprawdzić? ");
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
//            System.out.println(checkPrime(in.nextInt()));
//            System.out.println(prime(i));
            primeDruk(i);
        }
    }

    static String checkPrime(int numberToCheck) {
        if (numberToCheck < 2) {
            return "NIE";
        } else {
            for (int i = 2; i < numberToCheck; i++) {
                if (numberToCheck % i == 0) {
                    return "NIE";
                }
            }
            return "tak";
        }
    }


    static int prime(int prime) {
        if (prime < 2) {
            return 0;
        } else {
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    return 0;
                }
            }
            return prime;
        }
    }
    static int li=0;
    static int primeDruk(int prime) {

        if (prime < 2) {return 0;
        } else {
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                return 0;
                }
            }
            ++li;
            System.out.print(+li+"->"+prime+",  ");
        }
        return prime;
    }






}
