import java.util.Scanner;

public class Ost2Cyfry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int liczbaPrzypadkow = input.nextInt();
      int  TabPom [] =new int[liczbaPrzypadkow];

        for ( int i = 0; i < liczbaPrzypadkow; i++){
        }
    }

    public static String metoda(int theNumber){
        if (theNumber == 1){
            return "0 0";
        }
        if (theNumber == 2){
            return "0 2";
        }
        if (theNumber == 3){
            return "0 6";
        }
        if (theNumber == 4){
            return "2 4";
        }
        if (theNumber == 5 ||theNumber ==6 || theNumber==8){
            return "2 0";
        }
        if (theNumber == 7){
            return "4 0";
        }
        if (theNumber == 9){
            return "8 0";
        } else return "0 0";

    }
}
