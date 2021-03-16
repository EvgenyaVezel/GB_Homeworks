public class MainClass {

    public static final int CATSNUM = 8;//кол-во котов в массиве котов

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        barsik.eat(plate);
        System.out.printf("Кот %s сыт? - %b\n",barsik.getName(), barsik.isSatiety());

        Cat murka = new Cat("Murka", 5);
        Plate plate2 = new Plate(4);
        murka.eat(plate2);
        plate.info();
        System.out.printf("Кот %s сыт? - %b\n",murka.getName(), murka.isSatiety());

        System.out.println();
        System.out.println("Толпа котов и одна тарелка:");

        Cat[] cats = new Cat[CATSNUM];
        String[]catsNames = {"Kilka", "Sam", "Mike", "Vas'ka", "Bob", "Bill", "Miki", "Lukas"};//массив имен для заполнения объекта Cat
        int[]appetitesCats = {10,4,18,23,9,20, 12, 40};//массив аппетита для заполнения объекта Cat

        Plate plateForCats = new Plate(100);
        plateForCats.info();
        System.out.println("Котам дана команда 'К столу!'");
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(catsNames[i], appetitesCats[i]);
            cats[i].eat(plateForCats);
            plateForCats.info();
            System.out.printf("Кот %s сыт? - %b\n",cats[i].getName(), cats[i].isSatiety());
            System.out.println();
        }




    }
}
