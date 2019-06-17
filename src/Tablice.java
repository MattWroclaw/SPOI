import java.util.Arrays;
import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int ileTestow = in.nextInt(); //ile testow
        int [][] tabZWynikami = new int[ileTestow][];


        for ( int i = 0; i < ileTestow; i++){
            int  ileLiczb = in.nextInt(); // ile liczb wpisywanych

            int [] wyniki = new int[ileLiczb];

            for (int j =0; j<ileLiczb; j++){
                int liczba =in.nextInt();
                wyniki[j] =liczba;
            }
            tabZWynikami[i]=wyniki;

        }

//        for (int [] tablice : tabZWynikami ){
//            for (int liczby : tablice){
//                System.out.print(liczby+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(tabZWynikami));
        for (int k = 0; k < tabZWynikami.length; k++){
            for (int s = tabZWynikami[k].length; 0<s; s--){
                System.out.print(tabZWynikami[k][s-1]+" ");
            }
            System.out.println();
        }

    }
}