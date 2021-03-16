public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;//сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean isSatiety() {
        return satiety;
    }
    public String getName() {
        return name;
    }

    public void eat(Plate p){
        if(p.getFood() < appetite){
            System.out.printf("В тарелке %d еды, а кот пытается съесть %d, так нелья!\n", p.getFood(), appetite);
        }

        else {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }
}
