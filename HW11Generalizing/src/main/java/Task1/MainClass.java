package Task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        GenerikClass<String> strMas = new GenerikClass<>("Яблоко", "Груша", "Апельсин", "Манго");

        System.out.println("исходный массив: " + Arrays.toString(strMas.getMas()));
        strMas.swap(0, 2);//меняем местами

        GenerikClass<Integer> intMas = new GenerikClass<>(1, 2, 3, 4);
        System.out.println("исходный массив: " + Arrays.toString(intMas.getMas()));
        intMas.swap(0, 1);//меняем местами

        List<String> list = strMas.massToList();//превращаем массив в коллекцию
        list.add("Арбуз");//добавляем еще один элемент
        list.forEach(System.out::println );  //вывод коллекции
    }
}
