import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kenar = new Scanner(System.in);
        int a , b ;

        double c ;
        System.out.print("1.Kenari giriniz : ");
        a = kenar.nextInt();
        System.out.print("2.Kenari giriniz : ");
        b = kenar.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenus : " + c);





    }
}