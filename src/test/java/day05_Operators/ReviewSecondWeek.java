package day05_Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReviewSecondWeek {
    public static void main(String[] args){

       int a=26;
       int b=25;
       System.out.println("a ve b eşit mi ="+(a==b)); //a ve b eşit mi
       System.out.println("a b den farklı mı ="+(a!=b)); //a ve b farklı mı
       System.out.println("a b den küçük mü ="+(a<b)); //a ve b küçük  mü
       System.out.println("a b den küçük eşit mi ="+(a<=b)); //a ve b küçük eşit  mü
       System.out.println("a b den büyük  mi ="+(a>b)); //a ve b büyük  mü
       System.out.println("a b den büyük eşit mi ="+(a>=b)); //a ve b büyük eşit  mü



        // Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=scan.nextInt();
       int yüzler=sayi%10;

       sayi=sayi/10;
       int onlar=sayi%10;

       sayi=sayi/10;

        int birler=sayi%10;

        System.out.println("yeni sayı ="+yüzler+onlar+birler);



    }

}
