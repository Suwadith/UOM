package A_02;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class NameAndPhone {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of inputs you are willing to add");
        int numberOfInputs = sc.nextInt();

        String[][] storage = new String[numberOfInputs][2];

        System.out.println("Please input the name and the phone number");

        for(int i=0; i<numberOfInputs; i++) {

            storage[i][0]=sc.next();
            storage[i][1]= sc.next();

        }

        System.out.println();
        System.out.println("Please enter the name that you'd wish to search for");
        String searchName = sc.next();

        boolean flag = false;

        for(int i=0; i<numberOfInputs; i++){


            if(storage[i][0].equals(searchName)){
                System.out.println("Phone number: " + storage[i][1]);
                flag = true;
            }

        }

        if(flag == false){
            System.out.println("Name does not exist");
        }
    }

}
