import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CzyUmieszPotegowac {

    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ileTestow = Integer.parseInt(br.readLine());
//        String linia = "";

//        int ileTestow = input.nextInt(); // ile razy powtorzyc test
        int[] tabWyn = new int[ileTestow];
//
        for (int i = 0; i < ileTestow; i++) {
           String linia = br.readLine();
            String[] dane = linia.split(" ");

            int a = Integer.parseInt(dane[0]);
            int b = Integer.parseInt(dane[1]);

//            int a = input.nextInt();
//            int b = input.nextInt();

//            int potega =(int)Math.pow(a,b);
            int potega = 1;

            while (b > 0) {
                potega = potega * a;
                b--;
            }
            int cyfraJednosci;

            if (potega < 10) {
                cyfraJednosci = a;
            } else {
                int pomocnicza = potega;
                int k = 1;
                int dziesiecDoPotegi = 10;
                cyfraJednosci = pomocnicza % dziesiecDoPotegi;
                while (cyfraJednosci > 9) {
                    dziesiecDoPotegi = (int) Math.pow(10, k);
                    k++;
                }

            }
//            System.out.println(cyfraJednosci);
            tabWyn[i] = cyfraJednosci;
        }
        for (int cyfry : tabWyn) {
            System.out.println(cyfry);
        }
//

    }
}
