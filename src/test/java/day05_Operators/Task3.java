package day05_Operators;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int sayi=scan.nextInt();
         boolean sayiTekMi=!((sayi%10==0)||(sayi%10==2)||(sayi%10==4)||sayi%10==6||sayi%10==8);

         System.out.print("sayı tek mi ="+sayiTekMi);
    }
}
