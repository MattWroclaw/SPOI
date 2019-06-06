import java.util.Scanner;

public class CzyUmieszPotegowac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ileTestow = input.nextInt(); // ile razy powtorzyc test
//        int tabPom []=new int[ileTestow];
//        for (int i=0;i<ileTestow; i++){
//            tabPom[i]=potOsCy();
//        }
//        for (int i=0;i<ileTestow; i++){
//            System.out.println(tabPom[i]);
//        }

        for (int i=0;i<ileTestow; i++){
            System.out.println(ptgOs(input.nextInt(), input.nextInt()));
        }


    }
    static public int potOsCy(){
        Scanner inpt=new Scanner(System.in);
        int dol = inpt.nextInt();
        int gora = inpt.nextInt();

        double potega = Math.pow(dol, gora);
        int wynik = (int) potega%10;
        return wynik;
    }

    static public int ptgOs(int dol, int gora){
//        Scanner inpt=new Scanner(System.in);
//         dol = inpt.nextInt();
//         gora = inpt.nextInt();

        double potega = Math.pow(dol, gora);
        int wynik = (int) potega%10;
        return wynik;
    }

}
