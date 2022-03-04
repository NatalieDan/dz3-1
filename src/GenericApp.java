//Task 1,2

import java.util.ArrayList;
import java.util.Arrays;

public class GenericApp<T> {
    public static void main(String[] args) {
        //1
        String[] arrString = {"111", "444", "777"};
        OneGeneric obj1 = new OneGeneric(arrString);
        obj1.printObj();
        obj1.changeObj(0,2);
        obj1.printObj();

        Integer[] arrInt = {123, 456, 789};
        OneGeneric obj2 = new OneGeneric(arrInt);
        obj2.printObj();
        obj2.changeObj(0,1);
        obj2.printObj();

        //2
        obj1.arrToArrayList();
    }

    public static class OneGeneric<T> {
        private T[] obj;


        private OneGeneric(T[] obj) {
            this.obj = obj;
        }

        private T[] getObj() {
            return obj;
        }

        private void changeObj(int a, int b){
            T[] obj = this.getObj();
            T t = obj[a];
            obj[a] = obj[b];
            obj[b] = t;
        }

        private void printObj(){
            for(T a: this.getObj()){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        private void arrToArrayList(){
            ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(this.getObj()));
            System.out.println(arrayList);
        }
    }
}
