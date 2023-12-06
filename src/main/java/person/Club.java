package person;

public class Club <T extends Person>{
    Person[] array;
    Club(T[] t){
        this.array=t;
    }
    void heverest(){
        for (Person item: array) {
            item.haveRest();
        }
    }
}
