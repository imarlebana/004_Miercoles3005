package es.cice;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 0;

        if (num >0){
            factorial = 1;
            //for (int i = num; i > 0; i-- ){
            //    factorial = factorial *i;
            //}

            for (int i = 1; i <=num; i++ ){
                factorial = factorial *i;
            }


        }
        System.out.println("el factorial es: " + factorial);

    }
}
