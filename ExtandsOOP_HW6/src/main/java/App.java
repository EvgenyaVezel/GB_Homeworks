public class App {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        barsik.run(20);
        barsik.swim(150);

        Cat murka = new Cat("Мурка");
        murka.run(5);
        murka.swim(100);

        Dog bobik = new Dog("Бобик");
        bobik.run(150);
        bobik.swim(8);

        System.out.println("Количество созданных животных "+ Animals.numInstans);
        System.out.println("Количество созданных кошек "+ Cat.numCats);
        System.out.println("Количество созданных собак "+ Dog.numDogs);

    }
}
