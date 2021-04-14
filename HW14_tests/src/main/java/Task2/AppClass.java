package Task2;

import java.util.Arrays;

public class AppClass {
    public static void main(String[] args) {
        int[] masOrigin = {1,4,1,1,4,1,3};
        System.out.println(checkForAndOne(masOrigin));
    }

    static boolean checkForAndOne(int[]mas){

       if(Arrays.stream(mas).filter(n->n!=4 && n!=1).count() >0){

           return false;
       }
        return true;
    }
}
