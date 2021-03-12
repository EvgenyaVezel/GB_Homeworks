public class Cat extends Animals{

public static int numCats;
    public Cat(String name) {
        super(name);
        numCats++;
    }

    @Override
    public void swim(int lengthBlock) {
        System.out.printf("%s не умеет плавать!\n",name);
    }

    @Override
    public void run(int lengthBlock) {
        if(lengthBlock > 200){
            System.out.printf("%s может пробежать расстояние не более 200 метров\n", name);
        }
        else
        {
            System.out.printf("%s пробежал %d метров\n", name, lengthBlock);
        }
    }




}
