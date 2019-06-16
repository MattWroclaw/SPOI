import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZabawneDodawaniePiotrusia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<Integer, Integer> m = new HashMap<>();

        int ileLiczb = input.nextInt(); //1 linia: ile testów - liczb

        String tabWyn[] = new String[ileLiczb];
        String linia = "";
        int liczniTabelkiPoj = 0;
        int i = 0;
        while (i < ileLiczb) { //pętla dla tych testów


            int liczba = input.nextInt();  //wpisz swoją liczbę
            int licznik = 0;
            int trafiona = 0;

            //sprawdzam czy to jest palidrom
            if (liczba < 10) {
                liczba = liczba;
            } else {
                if (liczba == odwracanie(liczba)) {
                    liczba = trafiona;
                }
                //gdy nie jest , to miącham tak długo aż jest
                while (liczba != odwracanie(liczba)) {
                    liczba = liczba + odwracanie(liczba);
                    licznik++;
                }
            }
            linia = Integer.toString(liczba) +" " +Integer.toString(licznik);
            tabWyn[i] = linia;

            m.put(liczba, licznik);

            i++;
        }
        for (int k = 0; k < tabWyn.length; k++) {
            System.out.println(tabWyn[k]);
        }

        System.out.println(m);

//        for (int j = 0; j<tabWyn.length;j++){
//            for (int h=0; h<2;h++){
//                System.out.print(tabPoj[h]);
//            }
//            System.out.println();
//        }


    }


    static public int odwracanie(int lczb) {
        int odworoona = 0;
        while (lczb != 0) {
            odworoona = odworoona * 10;
            odworoona = odworoona + lczb % 10;
            lczb = lczb / 10;
        }
        return odworoona;
    }
}
