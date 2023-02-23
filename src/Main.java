import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double Armut = 2.14,a;
      double  Elma = 3.67,e ;
       double Domates = 1.11,d;
       double Muz= 0.95,m ;
      double  Patlican =5.00,p ;
      double ucret;
        Scanner oku=new Scanner(System.in);


        System.out.print("Armut kac kilo? ");
        a=oku.nextInt();

        System.out.print("\nElma kac kilo? ");
        e=oku.nextInt();

        System.out.print("\nDomates kac kilo? ");
        d=oku.nextInt();

        System.out.print("\nMuz kac kilo? ");
        m=oku.nextInt();

        System.out.print("\nPatlican kac kilo? ");
        p=oku.nextInt();

        ucret=Armut*a+Elma*e+Muz*m+Patlican*p+Domates*d;

        System.out.println("\nManav ucretiniz = "+ucret+" TL");




    }
}