import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Podzielnosc {


    public static void main(String[] args) {

        Podzielnosc podzielnosc = new Podzielnosc();
        podzielnosc.metoda();
    }

    int tabSzuk[];

    public void metoda() {
        Scanner input = new Scanner(System.in);
        int ileRazy = input.nextInt();

        int szukana = -1;
        int licznikSzuanych = 0;

        for (int i = 0; i < ileRazy; i++) {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            tabSzuk = new int[n];

            for (szukana = 0; szukana < n; szukana++) {
                if (szukana % x == 0 && szukana % y != 0) {

                    licznikSzuanych++;
                    tabSzuk[licznikSzuanych] = szukana;
                }
            }


        }
        for (int f = 0; f< ileRazy; f++) {
            for (int k = 0; k < licznikSzuanych; k++) {
                System.out.print(tabSzuk[k]+" ");
                System.out.println("========");
            }
        }
    }
}
