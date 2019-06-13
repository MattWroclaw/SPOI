import java.util.Scanner;

public class PolePewnegoKola {
    public static void main(String[] args) {

    final double pi =  3.141592654;
    double r, d,s;

        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        d = input.nextDouble();
//r2= d2 +R2
        // R=pierw(r2-d2)
        //pole = pi R2
        //pole = pi*(r2-d2)
        s=(Math.pow(r,2)-Math.pow(d, 2)/4)*pi;
        System.out.println(s);
    }
}
