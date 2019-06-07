import java.util.Scanner;

public class ProsteDodawanie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ileRazy = in.nextInt();
        int suma=0;
        int ileLiczb= 3;
        int tabWyn[] = new int[ileRazy];

        for (int i=0; i<ileRazy;i++){
            ileLiczb = in.nextInt();
            suma = 0;

            for ( int j=0; j<ileLiczb;j++){
                suma= suma+in.nextInt();
            }
//
            tabWyn[i]=suma;
//            for (i=0; i<ileRazy; i++){
//                tabWyn[i]=suma;
//
//            }

        }

       for (int k=0; k<ileRazy;k++){
           System.out.println(tabWyn[k]);
           suma=0;
       }

    }


}
