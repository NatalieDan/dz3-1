import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private int weigth;
    private boolean isFruitInBox;
    private String type;

    public boolean isFruitInBox() {
        return isFruitInBox;
    }

    public void setFruitInBox(boolean fruitInBox) {
        isFruitInBox = fruitInBox;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void addInBox(Box box){
        if (!isFruitInBox) {
            try {
                if (box.getType().equals(type)) {
                    ArrayList<Fruit> fruits = box.getListOfFruits();
                    fruits.add(this);
                    box.setListOfFruits(fruits);
                    isFruitInBox = true;
                } else {
                    System.out.println("Этот фрукт нельзя добавить в эту коробку");
                }
            } catch (NullPointerException e) {
                box.setType(this.type);
                ArrayList<Fruit> fruits = box.getListOfFruits();
                fruits.add(this);
                box.setListOfFruits(fruits);
                isFruitInBox = true;
            }
        } else {
            System.out.println("Фрукт уже добавлен в коробку");
        }
    }
}
