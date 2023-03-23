package day04_Review;

import java.util.Scanner;


public class ScannerClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        System.out.println("Adınızı giriniz =");
//        String isim=sc.nextLine();
//        System.out.print("adınız ="+isim);
//

//        System.out.println("numara");
//        int num1=sc.nextInt();
//        num1+=5;
//        System.out.println("num1 = " + num1);

        int num1=7;
        int resault1= ++num1;
        int resault2= num1++;
        int resault3= --num1;
        int resault4= num1--;
        System.out.println("resault1 = " + resault1);
        System.out.println("resault2 = " + resault2);
        System.out.println("resault3 = " + resault3);
        System.out.println("resault4 = " + resault4);


    }
}
