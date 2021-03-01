package ClassesHomework3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int g = 1;
        System.out.printf("Компьютер загадал число от 0 до 9\n Вам дается 3 попытки, чтоб его отгадать\n");
        while(g ==1){
            int secretNum = generateNumber();
            g = game(secretNum);
        }
        System.out.println("Спасибо за игру!");
    }


       public static int game(int secretNum){
           int p = 1, retP;
           Scanner sc = new Scanner(System.in);
           while (p <= 3) {
               System.out.printf("Попытка %x, введите число\n", p);

               int num = sc.nextInt();

               if (num == secretNum) {
                   System.out.println("Вы угадали! Сыграть попытку еще раз? 1 - повторить, 0 - нет");
                   retP = sc.nextInt();
                   while(retP >=2 || retP<0){
                       System.out.println("Введено некорректное значение! Введите 0 для выхода или 1 для повтора игры!");
                       retP = sc.nextInt();
                   }
                   return retP;
               }

               String s = (num > secretNum) ? "БОЛЬШЕ" : "МЕНЬШЕ";
               System.out.printf("Введенное число %s загаданного \n", s);

               p++;
           }
           System.out.println("Вы НЕ угадали! Сыграть попытку еще раз? 1 - повторить, 0 - нет");
           retP = sc.nextInt();
           while(retP >=2 || retP<0){
               System.out.println("Введено некорректное значение! Введите 0 для выхода или 1 для повтора игры!");
               retP = sc.nextInt();
           }
           return retP;
       }

    public static int generateNumber(){
        Random rn = new Random();
        return rn.nextInt(10);
    }
}
