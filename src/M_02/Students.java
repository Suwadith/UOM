package M_02;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class Students {

    public static int returnHighest(int[] marks){

        int highest = marks[0];

        for(int i=0; i<marks.length; i++){
            if(marks[i]>highest){
                highest=marks[i];
            }
        }

        return highest;
    }

    public static int[] sortInAscending(int[] marks){

        for (int a = 0; a < marks.length; a++) {
            for (int b = 0; b < marks.length - 1; b++) {
                if (marks[b] > marks[b + 1]) {
                    int temp = marks[b + 1];
                    marks[b + 1] = marks[b];
                    marks[b] = temp;
                }
            }
        }

        return marks;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the marks of 10 Students");

        int [] marks = new int[10];

        for(int i=0; i<10; i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Highest Score: " + returnHighest(marks));

        int soreted [] = sortInAscending(marks);

        for(int i=0; i<10; i++){
            System.out.print(soreted[i]+", ");
        }

    }

}
