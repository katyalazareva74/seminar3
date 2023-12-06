package person;

public class Workplace <T extends Person>{
    Person[] array1;
    Workplace (T[] t) {
        this.array1 = t;
    }
    void work(){
        for (Person item: array1) {
            item.doWork();
        }
    }
}
