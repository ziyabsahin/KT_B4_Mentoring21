package day07;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int num= scan.nextInt();
        int resault=num>50?1:0;
        System.out.println(resault);
    }
}
