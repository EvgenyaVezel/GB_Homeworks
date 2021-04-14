package Task1;

import org.junit.Before;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static final int FINED_VALUE = 4;

    public static void main(String[] args) {
        int[] mass = {1, 2, 4, 4, 2, 3, 4, 1, 7, 8};

        int[] massCh = changeMass(mass);
        System.out.println(Arrays.toString(massCh));
    }

    public static int[] changeMass(int[] mass) {

        if (Arrays.stream(mass).filter(n -> n == FINED_VALUE).count() == 0) {
            throw new ValueNotFoundException(FINED_VALUE);
        }
        List<Integer> ls = new ArrayList<>();
        int num = 0;
        for (int i = mass.length - 1; i > 0; i--) {
            if (mass[i] == FINED_VALUE) {
                num = i;
                break;//получим значение индекса последней 4-ки
            }
        }

        for (int i = num + 1; i < mass.length; i++) {//цикл от последней 4-ки
            ls.add(mass[i]);
        }


        return ls.stream().mapToInt(i -> i).toArray();
    }
}

