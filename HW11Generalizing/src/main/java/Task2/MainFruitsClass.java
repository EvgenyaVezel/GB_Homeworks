package Task2;

public class MainFruitsClass {

    public static void main(String[] args) {
        Apple appleGreen = new Apple(Color.GREEN);//создаем яблоки
        Apple appleYellow = new Apple(Color.YELLOW);
        Apple appleRed = new Apple(Color.RED);

        Box<Apple> appleBox = new Box<>();//корзинка с яблоками
        Box<Apple> appleBox2 = new Box<>();

        appleBox.addInBox(appleGreen);//кладем яблоки в корзинки
        appleBox.addInBox(appleYellow);
        appleBox2.addInBox(appleRed);

        System.out.println("Содержимое корзинки c яблоками ");
        for (Apple boxFruit : appleBox.getBoxFruits()) {//выводим содержимое корзинок
            System.out.println(boxFruit.toString());
        }
        System.out.println("Вес корзинки с яблоками " + appleBox.getWeight());//вес корзинки с яблоками

        Orange orangeRed = new Orange(Color.RED); //апельсины
        Orange orangeOrange = new Orange(Color.ORANGE);

        Box<Orange> orangeBox = new Box<>();//корзинка с апельсинами
        orangeBox.addInBox(orangeRed);//добавляем апльсины в корзинку
        orangeBox.addInBox(orangeOrange);

        System.out.println("Содержимое корзинки c апельсинами:");
        for (Orange boxFruit : orangeBox.getBoxFruits()) {
            System.out.println(boxFruit.toString());
        }
        System.out.println("Вес корзинки с апельсинами " +  orangeBox.getWeight());

        String s = appleBox.compare(orangeBox) ? "равен": "разный";
        System.out.println("Вес у корзинок " +s);

        appleBox2 = appleBox.moveFruitsToBox(appleBox2);//пересыпаем яблоки из 1-ой корзинки во 2-ю

        for (Apple boxFruit : appleBox2.getBoxFruits()) {//выводим содержимое второй корзинки
            System.out.println(boxFruit.toString());
        }



    }
}
