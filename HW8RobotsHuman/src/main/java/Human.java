public class Human implements Move{
    private double maxJump;
    private double maxRun;
    private String name;

    public Human(double maxJump, double maxRun, String name) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.name = name;
    }

    @Override
    public double getMaxJump() {
        return maxJump;
    }

    @Override
    public double getMaxRun() {
        return maxRun;
    }

    @Override
    public void run() {
        System.out.printf("Человек %s успешно пробежал дистанцию\n", name);
    }

    @Override
    public void jump() {
        System.out.printf("Человек %s успешно перепрыгнул стену\n", name);
    }

    @Override
    public String toString() {
        return "Человек " +name + ", который может прыгать в высоту "+ maxJump + " и бежать " + maxRun;
    }
}
