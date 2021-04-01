package Task2;

public class Orange extends Fruit{


    public Orange(Color color) {
        super(color);
        weight = 1.5f;
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
        return "Апельсин " +colorName +" цвета";
    }


}
