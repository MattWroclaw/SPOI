import java.util.Scanner;

public class PESEL {
    public static void main(String[] args) {
        System.out.println(osad());
    }

    static public int []pobDanch() {
        Scanner input = new Scanner(System.in);
        int tabPes[] = new int [11];
        for (int i=0; i<11; i++ ){
            int cyfra = input.nextInt();
            tabPes[i]=cyfra;
        }
        return tabPes;
    }

    static public int suma(){

        int []dane = pobDanch();
        int sumaWag = dane[0]*1+dane[1]*3+dane[2]*7+dane[3]*9+dane[4]*1
                +dane[5]*3+dane[6]*7+dane[7]*9+dane[8]*1+dane[9]*3+dane[10]*1;

        return sumaWag;
    }
    static public String osad(){
       int sumaKontr = suma();
        System.out.println("suma = "+sumaKontr);
        sumaKontr=12;
        if (sumaKontr%10==0){
           return  "prawidłowy";
        }else  return "błąd";
    }



}
