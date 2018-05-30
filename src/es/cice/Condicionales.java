package es.cice;

public class Condicionales {

    public static void main(String[] args) {

        //ESTRUCTURA IF / IF_ELSE
        int a = (int) Math.random();
        if(a%2==0){
            System.out.println("Holi");
        }else{
            System.out.println("dew");
        }


        //switch
        switch(2/5){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
    }
}
