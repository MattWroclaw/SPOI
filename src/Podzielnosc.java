import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Podzielnosc {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ileTestow = in.nextInt();

        for (int i = 0; i<ileTestow; i++){
            drukuj(listaZbiorcza(podzielnosc(pobieraczdanych())));

        }
    }

    static public int[] pobieraczdanych() {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();

        int dane[] = new int[3];
        dane[0]=n;
        dane[1]=x;
        dane[2]=y;
        return dane;
    }



    static public List podzielnosc(int[] tabZdanymi) {
        int n = tabZdanymi[0];
        int x = tabZdanymi[1];
        int y = tabZdanymi[2];

        int szukana;

        List<String> listaWynikow = new ArrayList<>();

        int licznikSzukanych = 0;
        for (szukana = 1; szukana < n; szukana++) {
            if (szukana % x == 0 && szukana % y != 0) {
                listaWynikow.add(Integer.toString(szukana));
                licznikSzukanych++;
            }
        }

       return listaWynikow;
    }

    static public List<List> listaZbiorcza(List lista){
        listaZbiorcza(lista).add(lista);
        return listaZbiorcza(lista);
    }


   static public void drukuj(List<List> lzb){
        int dl = lzb.size();
        for  (int i = 0; i < dl; i++) {
            List temp =lzb.get(i);
            for (int j = 0 ; j<lzb.get(i).size();j++) {

                System.out.println(lzb.get(i).get(j));
            }
        }
    }

}
