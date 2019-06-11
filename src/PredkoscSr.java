import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PredkoscSr {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int ileRazy = Integer.parseInt(bufferedReader.readLine());

        int srednia;
        int tabWyn[] = new int[ileRazy];

        for (int i = 0; i < ileRazy; i++) {
            String wiersz = bufferedReader.readLine();

            String predkosc [] = wiersz.split(" ");
            int v1 = Integer.parseInt( predkosc[0]);
            int v2 = Integer.parseInt(predkosc[1]);

            srednia = 2 * v1 * v2 / (v1 + v2);
            tabWyn[i] = srednia;
        }

        for (int elem : tabWyn) {
            System.out.println(elem);
        }

    }


}
