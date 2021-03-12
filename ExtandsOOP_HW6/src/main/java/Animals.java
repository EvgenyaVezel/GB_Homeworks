public class Animals {

    protected String name;
    public static int numInstans;//счетчик инстансов класса

    public Animals(String name) {
        this.name = name;
        numInstans++;
    }


    void swim(int lengthBlock){
        System.out.printf("%s проплыл %d метров\n", name, lengthBlock);
    }


    void run(int lengthBlock){
        System.out.printf("%s пробежал %d метров\n", name, lengthBlock);
    }



}
