public class Robot implements Move {

    private double maxJump;
    private double maxRun;
    private String name;

    public Robot(double maxJump, double maxRun, String name) {
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
        System.out.printf("Робот %s успешно пробежал дистанцию\n", name);
    }

    @Override
    public void jump() {
        System.out.printf("Робот %s успешно перепрыгнул стену\n", name);
    }

    @Override
    public String toString() {
        return "Робот " +name + ", который может прыгать в высоту "+ maxJump + " и бежать " + maxRun;
    }
}
