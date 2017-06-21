package M_03;

/**
 * Created by suwad on 6/21/2017.
 */
public class Pyramid {

    public static void main(String[] args){

        int count = 5;

        for(int i=0; i<5; i++){
            for(int x=0; x<i+1; x++){
                System.out.print(count);
            }
            count--;
            System.out.println();
        }

    }

}
