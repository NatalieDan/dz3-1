import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> listOfFruits;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Box() {
        this.listOfFruits = new ArrayList<>();
        this.type = null;
    }

    public int getWeigth(){
        if (listOfFruits.size() != 0){
            return listOfFruits.size()*(listOfFruits.get(0).getWeigth());
        }
        else{
            return 0;
        }
    }

    public ArrayList<T> getListOfFruits() {
        return listOfFruits;
    }

    public void setListOfFruits(ArrayList<T> listOfFruits) {
        this.listOfFruits = listOfFruits;
    }

    public boolean compare(Box anotherBox){
        if (this.getWeigth() == anotherBox.getWeigth()){
            return true;
        } else{
            return false;
        }
    }

    public void pourIntoAnotherBox(Box anotherBox){
        try{
            if (anotherBox.type.equals(this.type)){
                for (T fruit: this.getListOfFruits()){
                    anotherBox.listOfFruits.add(fruit);
                }
                this.listOfFruits = new ArrayList<>();
                this.type = null;
            } else {
                System.out.println("В данных коробках находятся разные фрукты.");
            }
        } catch(NullPointerException e){
            for (T fruit: this.getListOfFruits()){
                anotherBox.listOfFruits.add(fruit);
            }
            this.listOfFruits = new ArrayList<>();
            anotherBox.setType(this.type);
            this.type = null;
        }
    }
}
