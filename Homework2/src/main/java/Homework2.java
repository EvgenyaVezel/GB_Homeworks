import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        revertMassiv();

        //Задание 2
        System.out.println("Задание 2");
        fillMassiv();

        //Задание 3
        System.out.println("Задание 3");
        multiplyMassiv();

        //Задание 4
        System.out.println("Задание 4");
        matrix();

        //Задание 5
        System.out.println("Задание 5");
        minMaxEl();

        //Задание 6
        System.out.println("Задание 5");
        Scanner scanner = new Scanner(System.in);

        int[] m= new int[8];
        System.out.println("Введите массив размером 8 ");
        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(m));
        System.out.println(summLeftRightParts(m));

        //Задание 7
        System.out.println("Задание 7");
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[5];
        int num = 0;
        System.out.println("Введите массив размером 5 ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(mas));

        System.out.println("Введите значение смещения ");
        num = scanner.nextInt();
        offsetMass(mas, num);
    }

    public static void revertMassiv(){
        int[] mas = {1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1};
        System.out.println("Исходный массив ");
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            switch (mas[i]){
                case 1: mas[i] = 0; break;
                case 0: mas[i] = 1; break;
            }

        }
        System.out.println(Arrays.toString(mas));
    }

    public static void fillMassiv(){
        int[] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            mas[i] =i * 3;
        }
        System.out.println(Arrays.toString(mas));
    }

    public static void multiplyMassiv(){
       int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < 6)
                mas[i]*=2;
        }
        System.out.println(Arrays.toString(mas));
    }

    public static void matrix(){
        int[][] matrixArray= new int[5][5];

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                if(i==j)
                    matrixArray[i][j] = 1;
            }
        }

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                System.out.print(matrixArray[i][j]);
            }
            System.out.println("");
        }
    }

    public static void minMaxEl(){
        Random random = new Random();
        random.ints(10);

        int[] m = new int[10];

        for (int i = 0; i < m.length; i++) {
            m[i] = (byte)random.nextInt();
        }
        System.out.println(Arrays.toString(m));
        int min, max;
        min = m[0]; max = 0;

        for (int i = 0; i < m.length; i++) {
            if(m[i] >max)
                max = m[i];
            if(m[i]< min)
                min = m[i];
        }

        System.out.println("минимальный эемент = " + min);
        System.out.println("максимальный эемент = " + max);
    }

    public static boolean summLeftRightParts(int[] m){

        int k = 0;
        for (int i = 0; i < m.length; i++) {
            k += m[i];
            int sum = 0;
            for (int j = i+1; j < m.length; j++) {
                sum+=m[j];
            }

            if(k == sum){
                for (int e = 0; e <= i; e++) {
                    System.out.print(m[e] + ", ");
                }
                System.out.print("||");
                for (int r = i+1; r < m.length; r++) {
                    System.out.print(m[r] + ", ");
                }

                return true;
            }

        }

        return false;
    }

    public static void offsetMass(int[] mass, int num){
        int i, j, sh;

        j = 0;
        sh = 0;
        if(num > 0) {
            i = mass[0];

            while (sh < num) {

                for (int k = 1; k <= mass.length; k++) {

                    if(k == mass.length) {
                        mass[0] =i;
                    }
                    else {
                        j = mass[k];
                        mass[k] = i;
                        i = j;
                    }
                }
                sh++;
            }
        }
        else
        {
            i = mass[mass.length-1];
            while (sh > num) {
                for (int k = mass[mass.length-2]; k>=-1; k--) {
                    if(k == -1) {
                        mass[mass.length-1] =i;
                    }
                    else{
                    j = mass[k];
                    mass[k] = i;
                    i = j;
                    }
                }
                sh--;
            }

        }
        System.out.println(Arrays.toString(mass));
    }
}
