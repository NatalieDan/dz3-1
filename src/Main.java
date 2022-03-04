//Task 3

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        apple1.addInBox(box1);
        apple2.addInBox(box1);
        //добавление апельсина к яблокам
        orange1.addInBox(box1);
        //повторное добавление фрукта
        apple1.addInBox(box1);

        System.out.println(box1.getWeigth());

        orange1.addInBox(box2);
        System.out.println(box2.getWeigth());

        //сравнение коробок
        System.out.println(box2.compare(box1));

        orange2.addInBox(box2);
        apple3.addInBox(box1);
        System.out.println(box1.compare(box2));

        //пересыпание фруктов из одной коробки в другую
        box1.pourIntoAnotherBox(box3);
        System.out.println(box3.getWeigth());
        System.out.println(box1.getWeigth());

        box3.pourIntoAnotherBox(box2);
    }
}
