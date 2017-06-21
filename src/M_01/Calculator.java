package M_01;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class Calculator {

    static Scanner sc = new Scanner(System.in);

    public static void menu(){

        System.out.println("Enter Value: ");
        int value = sc.nextInt();

        System.out.println("Menu");
        System.out.println("1. Add 10");
        System.out.println("2. Multiply by 4");
        System.out.println("3. Subtract 8");
        System.out.println("4. Quit");
        System.out.println("Enter your option: ");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println(add(value));
                menu();
            case 2:
                System.out.println(multiply(value));
                menu();
                case 3:
                System.out.println(subtract(value));
                menu();
                case 4:
                System.exit(0);
        }

    }

    public static int add(int value){

        int total = value + 10;

        return total;
    }

    public static int multiply(int value){

        int total = value*4;

        return total;
    }

    public static int subtract(int value){

        int total = value-8;

        return total;
    }

    public static void main(String[] args){

        menu();


    }

}
