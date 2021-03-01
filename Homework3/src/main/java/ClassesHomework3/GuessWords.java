package ClassesHomework3;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;


public class GuessWords {
    public static void main(String[] args) {
        String[] words =new String[] {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};


        System.out.println("Компьютер загадал одно из предложенных слов. Попробуйте его отгадать");
        String secretWord = generateWord(words);
        System.out.println(secretWord);

        for (String str: words) {
            System.out.print(str + ", ");
        }
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String userWord = scanner.next();

        while (!secretWord.equals(userWord)) {

           String sw = game(userWord, secretWord);
            System.out.printf("Вы не угадали слово. Загаданное слово %s\nПопробуйте еще раз ввести слово \n", sw);
            userWord = scanner.next();
        }
        System.out.println("Ура, Вы угадали! Спасибо за игру!");
    }

    public static String generateWord(String[] words){

        Random random = new Random();
        int i = random.nextInt(words.length);
        return words[i];
    }

    public static String game(String userWord, String secretWord){
        String w = "";

            for (int i = 0; i < secretWord.length(); i++) {
                if(i == userWord.length()) {break;}
               if(userWord.charAt(i) == secretWord.charAt(i)){
                   w +=userWord.charAt(i);
               }
               else
               {
                    w+="#";
               }
            }
            w+="###############";

        return w;



    }


}
