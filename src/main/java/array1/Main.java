package array1;


import java.util.Iterator;

public class Main {
    /**
     * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
     * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
     * @param args
     */
    public static void main(String[] args) {
        Integer n = 5;
        MyList1<Number> mylist = new MyList1<>();
        Iterator<Number> itar=mylist.iterator();
        mylist.addElement(1);
        mylist.addElement(1.0f);
        mylist.addElement(234685);
        mylist.addElement(n);
        while(itar.hasNext()){
            System.out.println(itar.next());
        }
        for (Number element: mylist) {
            System.out.println(element);
        }
        mylist.removeelem(2);
        mylist.printml();
    }
}
