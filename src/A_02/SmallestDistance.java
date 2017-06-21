package A_02;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class SmallestDistance {

    public static int returnSmallest(int[] storage){

        int index=0;

        int lowest = storage[0];

        for(int i=0; i<storage.length-1; i++){
            if(storage[i+1]<storage[i]){
                if(storage[i]-storage[i+1]<lowest){
                    lowest = storage[i]-storage[i+1];
                    index = i+1;
                }
            }else{
                if(storage[i+1]-storage[i]<lowest){
                    lowest = storage[i+1]-storage[i];
                    index = i;
                }
            }
        }

        System.out.println("Lowest Distance: " + lowest);

        return index;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount of input digits");
        int input = sc.nextInt();

        int[] storage = new int[input];

        System.out.println("please type the digits in a space separated manner");

        for(int i=0; i<input; i++){
            storage[i] = sc.nextInt();
        }

        System.out.println("Smallest number's Index: " + returnSmallest(storage));

    }

}
