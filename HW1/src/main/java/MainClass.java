import java.util.Scanner;

public class MainClass {
    //Все возможные типы переменных
    byte bt = 120;
    short sh = 4008;
    int i = 5687656;
    long ln = 7789908;
    boolean bl = true;
    char ch = 'A';
    float f = 67.8f;
    double db = 67.89;
    String S = "Hi!";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вызов арифметического метода для переменных типа float
        System.out.println("Арифметический метод:");
        System.out.println("Введите а ");
        float a = scanner.nextFloat();
        System.out.println("Введите b ");
        float b = scanner.nextFloat();;
        System.out.println("Введите c ");
        float c = scanner.nextFloat();;
        System.out.println("Введите d ");
        float d = scanner.nextFloat();;
        System.out.println("Вычисление..");

        float resultArifmetic = arifmeticMethod(a,b,c,d);
        System.out.println("Результат вычисления = " + resultArifmetic); 

        //Метод, проверяющий диапазон суммы целых чисел
        System.out.println("Проверка диапазона суммы чисел от 10 до 20:");
        System.out.println("Введите первое целое число ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе целое число ");
        int lastNumber = scanner.nextInt();

        System.out.println(summLimit(firstNumber, lastNumber));
        //Метод, сообщающий положительное или отрицательное число
        System.out.println("Введите целое число для проверки ");
        int num = scanner.nextInt();

        positiveOrNegativeNum(num);

        //Метод, сообщающий положительное или отрицательное число (true,false)
        System.out.println("Введите целое число для проверки ");
        int numRes = scanner.nextInt();
        if(resultPositiveoOrNegative(numRes)){
            System.out.println("Число " + numRes + " положительное");
        }
        else {
            System.out.println("Число " + numRes + " отрицательное");

        }

        //Метод, выводящий привествие по имени
        System.out.println("Введите имя ");
        String name = scanner.nextLine();
        imputHi(name);

        //Метод, определяющий високосный год
        System.out.println("Введите год ");
        short year = scanner.nextShort();
        leapYear(year);


    }


    public static float arifmeticMethod(float a,float b,float c, float d)
    {
        return a * (b + (c / d));
    }

    public static boolean summLimit(int a, int b)
    {
        int sm = a + b;
        if (sm >10 && sm<=20) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void positiveOrNegativeNum(int num)
    {
        if(num >=0) {
            System.out.println("Число "+ num + " положительное");
        }
        else {
            System.out.println("Число "+ num + " отрицательное");
        }
    }

    public static boolean resultPositiveoOrNegative(int plusNum)
    {
        if(plusNum >=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void imputHi(String name)
    {
        System.out.println("Hi, " + name + "!");
    }

    public static void leapYear(short year)
    {
       if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
           System.out.println("Год " + year + " високосный");
       }
       else {
           System.out.println("Год " + year + " не високосный");
       }
    }
}


