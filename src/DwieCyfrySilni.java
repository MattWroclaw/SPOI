import java.util.Scanner;

public class DwieCyfrySilni {


    public static void main(String[] args) {
        DwieCyfrySilni dc =new DwieCyfrySilni();

        Scanner input = new Scanner(System.in);
       int liTes= input.nextInt();  // 1 linijka -> ile razy robić test

        int licznik;
        int ile;
        int tabWynik []=new int[liTes];
        for (licznik=0; licznik<liTes; licznik++) {
             ile= dc.sumowanie();
            tabWynik [licznik]=ile;
        }
        for (licznik=0; licznik<liTes; licznik++){
            System.out.println(tabWynik[licznik]);
        }
//        int ile= dc.sumowanie();
//        int tyle=dc.sumowanie();
//        System.out.println(ile);
//        System.out.println(tyle);


    }

    public int sumowanie(){

             int suma =0;
                Scanner in = new Scanner(System.in);
        int ileDoSumowania = in.nextInt();
        int tab[] = new int[ileDoSumowania];

        for (int i = 0 ; i< ileDoSumowania; i++){
            int liczba =in.nextInt();
            tab[i]=liczba;
        }for (int i=0; i<tab.length;i++) {
             suma += tab[i];
        }
        return suma;
    }
    public void druk(){
        System.out.println(sumowanie());
    }
}
