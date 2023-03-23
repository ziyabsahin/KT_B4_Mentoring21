package day07;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

//      Ternary operator:   (condition) ? (return if true) : (return if false);

        //      Ternary operator:   (condition) ? (return if true) : (return if false);

//bir işci 2 saatin altındaki çalışma için 10
//2 ile 5 saat arası    20
//5 saatten fazla çalışırsa 35 dolar alıyor

        Scanner oku=new Scanner(System.in);
        System.out.println("Saati giriniz: ");
        int saat = oku.nextInt();
        if(saat>5){
            System.out.println(saat*35);
        } else if(saat>=2){
            System.out.println(saat*20);
        }else{
            System.out.println(saat*10);
        }




    }
}
