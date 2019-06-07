import java.util.Scanner;

public class Piaskownica {

    public static void main(String[] args) {
        Piaskownica piaskownica = new Piaskownica();

//    piaskownica.pd();
Scanner in = new Scanner(System.in);
    for (int i = 0 ; i <3; i++){
        int linczba = in.nextInt();
    }
    }

    public int [] pd() {
        Scanner in = new Scanner(System.in);
        int ileRazy = in.nextInt();
        int liczba=0;
        int licznik;
        int tab[] = new int[ileRazy];
        for ( licznik = 0 ; licznik<ileRazy;licznik++){
             liczba = in.nextInt();
             int tajne = liczba*1000;
           tab[licznik]=tajne;
        }
        int b = 10;

        for ( licznik = 0 ; licznik<ileRazy;licznik++){
            System.out.println(tab[licznik]);
        }
     return tab ;
    }

    public int met(int d){

        return d/2;
    }


}
