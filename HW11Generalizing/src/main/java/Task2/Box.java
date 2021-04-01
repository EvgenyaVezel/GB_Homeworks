package Task2;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{

    private List<T> boxFruits;

    public Box() {
        this.boxFruits = new ArrayList<>();
    }
    public List<T> getBoxFruits() {
        return boxFruits;
    }

    float getWeight(){//получить размер корзинки
        if(boxFruits.size() <=0){
            System.out.println("Корзинка пустая");
            return 0;
        }
        return boxFruits.get(0).weight * boxFruits.size();//вес фрукта * на количество
    }

     boolean compare(Box<? extends Fruit> otherBox){//сравнить корзинки

        if(this.getWeight() == otherBox.getWeight()){
            return true;
        }
        return false;
    }

    Box moveFruitsToBox(Box<T> box){//переложить фрукты из одной корзинки в другую
        box.getBoxFruits().addAll(boxFruits);
        boxFruits.clear();
        return box;

    }

    void addInBox(T e){
        boxFruits.add(e);
    }




}
