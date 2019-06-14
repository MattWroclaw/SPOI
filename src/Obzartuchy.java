import java.util.Scanner;

public class Obzartuchy {
    public static void main(String[] args) {



        int doba = 60*60*24;

        Scanner input = new Scanner(System.in);
        int ileTestow = input.nextInt();

        double [] tabWynikow = new double[ileTestow];
        for (int i = 0;i<ileTestow;i++){
            double wynik = 0;
            int ileGraczy= input.nextInt();
            int ileWPaczce = input.nextInt();
            double wSumie=0;

            for(int j=0; j<ileGraczy;j++){
                //podajemy czas zjadania 1 ciastka
                int czasZjadaniaCiastka = input.nextInt();

                double ileNaDobe = doba/czasZjadaniaCiastka;
                wSumie =+ wSumie+ileNaDobe;
            }
             wynik = wSumie/ileWPaczce;
            if (wynik!= (int)wynik){
                wynik = wynik+1;
            }
            tabWynikow[i]=(int)wynik;

        }
        for (double elementy : tabWynikow){
            System.out.println(elementy);
        }
    }
}
