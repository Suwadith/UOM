package M_01;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class SumAndAverage {

    public static void sumAverage (int value){

        int sum = 0;
        int count = 0;

        for(int i=1; i<=value; i+=2){
            sum +=i;
            count++;
        }

        double average = sum/count;

        System.out.println("The sum is " + sum);

        System.out.println("The average is " + average);

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input an integer value");

        int value = sc.nextInt();

        sumAverage(value);

    }

}
