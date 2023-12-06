package array;

import java.util.Iterator;

public class Main {
    /**
     * Написать итератор по массиву. Итератор – это объект, осуществляющий движение по коллекциям любого типа,
     * содержащим любые типы данных. Итераторы обычно имеют только
     * два метода – проверка на наличие следующего элемента и переход к следующему элементу.
     * @param args
     */
    public static void main(String[] args) {
        Integer n = 5;
        MyList<Number> mylist = new MyList<>();
        mylist.addElement(1);
        mylist.addElement(1.0f);
        mylist.addElement(234685);
        mylist.addElement(n);
        Iterator<Number> iter = mylist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        for (Number element: mylist) {
            System.out.println(element);
        }
        mylist.removeelem(2);
        mylist.printml();
    }
}
