package day05_Operators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz =");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int sonuc=sayi1-sayi2;


        boolean sonucTekmi=sonuc%2==1;
        System.out.println("tekMi = " + sonucTekmi);


    }
}
