package Task2;

public class Apple extends Fruit{




    public Apple(Color color) {
        super(color);
        weight = 1.0f;
       }

    public double getWeightApple() {
        return weight;
    }

    @Override
    public String toString() {

        String colorName = "";
        switch (color){
            case RED: colorName = "красного"; break;
            case GREEN: colorName = "зеленого"; break;
            case YELLOW: colorName = "желтого"; break;
            case ORANGE: colorName = "оранжевого"; break;
        }
        return "Яблоко " +colorName +" цвета";
    }


}
