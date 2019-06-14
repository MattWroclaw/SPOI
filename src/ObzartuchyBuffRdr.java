import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ObzartuchyBuffRdr {
    public static void main(String[] args) throws IOException {

        int doba = 60*60*24;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner input = new Scanner(System.in);
        int ileTestow = Integer.parseInt(bufferedReader.readLine());
        String line = "";

        double [] tabWynikow = new double[ileTestow];


        for (int i = 0;i<ileTestow;i++){
            double wynik = 0;

            line = bufferedReader.readLine();
            String []graczePaczka = line.split(" ");

            int ileGraczy= Integer.parseInt(graczePaczka[0]);
            int ileWPaczce = Integer.parseInt(graczePaczka[1]);
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
