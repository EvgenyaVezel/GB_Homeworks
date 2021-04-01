package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerikClass<T> {
    private T[] m;

    public GenerikClass(T... m) {
        this.m = m;

    }

    public T[] getM() {
        return m;
    }

    void swap(int i, int j) {
        T perem;
        if (m.length <= i) {
            throw new MasSizeBoundException(i);
        } else if (m.length <= j) {
            throw new MasSizeBoundException(j);
        }

        perem = m[i];
        m[i] = m[j];
        m[j] = perem;

        System.out.println("измененный массив: " + Arrays.toString(m));

    }

        List<T> massToList(){
        List<T> listForMas = new ArrayList<>();
        Collections.addAll(listForMas, m);
        return listForMas;
    }

    T[] getMas(){
        return m;
    }
}
