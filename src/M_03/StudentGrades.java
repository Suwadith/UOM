package M_03;

import java.util.Scanner;

/**
 * Created by suwad on 6/21/2017.
 */
public class StudentGrades {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count =0;

        int[] studentNumber = new int[50];

        int[] studentMarks = new int[50];

        String[] studentGrade = new String[50];

        System.out.println("Please input Student Number and Respective marks");

       for(int i=0; i<50; i++){

           int input1 = sc.nextInt();
           if(input1 == -1){
               break;
           }
           int input2 = sc.nextInt();
           if(input2 == -1) {
               break;
           }

               studentNumber[i]=input1;
               studentMarks[i]=input2;
               if(input2>=75){
                   studentGrade[i]= "A";
               }else if(input2>=60){
                   studentGrade[i]= "B";
               }else if(input2>=40){
                   studentGrade[i]= "c";
               }else{
                   studentGrade[i]= "F";
               }


           count++;
       }

        System.out.println();
        System.out.println("Student Record");
        System.out.println("==============");

       for(int i=0; i<count; i++){

           System.out.println(studentNumber[i] + " " + studentMarks[i] + " " + studentGrade[i]);
       }

    }

}
