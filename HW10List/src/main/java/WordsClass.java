import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WordsClass {

    public static void main(String[] args) {

        findCountWords();
    }

    static void findCountWords(){
        String[] m = {"avocado", "apple", "avocado", "orange", "kiwi", "banana", "bergamot", "durian", "grapefruit", "durian",  "apple", "apple", "apricot", "peach"};

        System.out.println("исходный список слов: "+Arrays.toString(m));

        Arrays.sort(m);// сортируем массив, вычитала в инете, что это "дешевле", чем сортировать коллекцию
        ArrayList<String> ls = new ArrayList<>(Arrays.asList(m));// создаю коллекцию на основе массива
        String previousWord = "";//переменная для хранения предыдущего слова
        for(String str: ls){
            if(previousWord == str){ continue; }//если строки рядом равны - пропускаем итерацию

            Stream stream = ls.stream();//стрим исходной коллекции
            long t = stream.filter(p -> p.equals(str)).count();
            if(t ==1){
                System.out.printf("слово %s уникальное, встречается %d раз\n",str, t);
            }
            else {
                System.out.printf("слово %s встречается %d раза\n",str, t);
            }
             previousWord = str;
        }




    }


}
