package A_03;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class HarshadNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input an Integer value");

        int number = sc.nextInt();
        int numberCopy = number;
        int total = 0;

        LinkedList digits = new LinkedList();

        while(number > 0){
            digits.push(number % 10);
            number = number /10;
        }

        while (!digits.isEmpty()) {
            total += new Integer(digits.pop().toString());
        }

        if(numberCopy%total==0){
            System.out.println("It is a HarshadNumber");
        }else{
            System.out.println("It is not a HarshadNumber");
        }
    }

}
