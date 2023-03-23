package day05_Operators;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

       System.out.print("lütfen bir sayı giriniz =");
       int sayi=scan.nextInt();

       boolean ciftMi=(sayi%2)==0;
       System.out.print("sayı çift mi =" +ciftMi);
       boolean tekMi=!(sayi%2==0);
        System.out.println("tekMi = " + tekMi);

    }
}
