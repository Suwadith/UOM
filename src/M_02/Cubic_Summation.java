package M_02;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class Cubic_Summation {

    public static int Summation(int start, int max){

        int total = 0;

        for(int i=start; i<=max; i+=2){
            total+=i*i*i;
        }

        return total;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the starting value");
        int start = sc.nextInt();

        System.out.println("Please Enter the maximum value");
        int max = sc.nextInt();

        int result = Summation(start, max);
        System.out.println(result);

    }

}
