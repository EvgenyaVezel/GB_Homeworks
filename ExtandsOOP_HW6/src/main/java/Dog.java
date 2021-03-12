public class Dog extends Animals{

    public static int numDogs;
    public Dog(String name) {
        super(name);
        numDogs++;
    }

    @Override
    void swim(int lengthBlock) {
        if(lengthBlock > 10){
            System.out.printf("%s может проплыть расстояние не более 10 метров\n", name);
        }
        else{
            System.out.printf("%s проплыл %d метров\n", name, lengthBlock);
        }

    }

    @Override
    void run(int lengthBlock) {
        if(lengthBlock > 500){
            System.out.printf("%s может пробежать расстояние не более 500 метров\n", name);
        }
        else
        {
            System.out.printf("%s пробежал %d метров\n", name, lengthBlock);
        }
    }
}
