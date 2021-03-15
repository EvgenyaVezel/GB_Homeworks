public class Plate {



    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке: " + food + " еды");
    }
    public int getFood() {
        return food;
    }
    public void decreaseFood(int n){
        food -= n;
    }
}
