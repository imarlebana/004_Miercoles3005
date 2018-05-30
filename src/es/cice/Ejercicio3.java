package es.cice;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Introduce un numero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num){
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Buenos dias");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                System.out.println("Buenas tardes");
                break;
            default:
                System.out.println("Buenas noches");
        }
    }
}
