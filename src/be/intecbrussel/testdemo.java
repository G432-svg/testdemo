package be.intecbrussel;

import java.util.Scanner;

public class testdemo {
    public static void main(String[] args) {

   Scanner kbd = new Scanner (System.in);
   int hour;

   do {
        System.out.println("Fill in the hour you started working [0-23]");
        int hour = kbd.nextInt();
        break;
        switch (hour){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:

            default:
                System.out.println("Veerkeerde input !\n");


        }

    } while(hour < 0 || hour > 23 );


   kbd.close();

}