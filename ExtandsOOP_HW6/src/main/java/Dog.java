public class Dog extends Animals{

    public static final int MAXSWIM = 10;
    public static final int MAXRUN = 500;
    public static int numDogs;
    public Dog(String name) {
        super(name);
        numDogs++;
    }

    @Override
    void swim(int lengthBlock) {
        if(lengthBlock > MAXSWIM){
            System.out.printf("%s может проплыть расстояние не более 10 метров\n", name);
        }
        else{
            System.out.printf("%s проплыл %d метров\n", name, lengthBlock);
        }

    }

    @Override
    void run(int lengthBlock) {
        if(lengthBlock > MAXRUN){
            System.out.printf("%s может пробежать расстояние не более 500 метров\n", name);
        }
        else
        {
            System.out.printf("%s пробежал %d метров\n", name, lengthBlock);
        }
    }
}
