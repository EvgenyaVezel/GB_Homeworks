import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AppClass {

    public static final int ARR_SIZE = 10000000;
    public static final int ARR_HALF = ARR_SIZE / 2;


    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        float[] arr = new float[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = 1;
        }

        long timeMathArr = System.currentTimeMillis();


        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.printf("Время расчета массива: %d\n", System.currentTimeMillis() - timeMathArr);
    }

    private static void method2() {
        float[] originalArr = new float[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            originalArr[i] = 1;
        }


        float[] firstPartArr = new float[ARR_HALF];
        float[] lastPartArr = new float[ARR_HALF];

        long a = System.currentTimeMillis();
        System.arraycopy(originalArr, 0, firstPartArr, 0, ARR_HALF);
        System.arraycopy(originalArr, ARR_HALF, lastPartArr, 0, ARR_HALF);

        System.out.printf("Время разбиения массива на два: %d\n", System.currentTimeMillis() - a);


        Thread tr1 = new Thread(() -> goArr(firstPartArr));

        Thread tr2 = new Thread(() -> goArr(lastPartArr));


        tr1.start();
        tr2.start();

        //склейка массивов
        long timeConnectArr = System.currentTimeMillis();
        System.arraycopy(firstPartArr, 0, originalArr, 0, ARR_HALF);
        System.arraycopy(lastPartArr, 0, originalArr, ARR_HALF, ARR_HALF);
        System.out.printf("Время склейки массивов: %d\n", System.currentTimeMillis() - timeConnectArr);


    }

    private static void goArr(float[] mass) {//метод расчета массива

        long a = System.currentTimeMillis();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (float) (mass[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }


        System.out.printf("Время расчета части массива: %d\n", System.currentTimeMillis() - a);
    }

}