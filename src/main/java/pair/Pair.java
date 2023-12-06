package pair;

public class Pair <T, E> {
     T first;
     E second;
    Pair(T t, E e){
        this.first=t;
        this.second=e;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public String toString(){
        return first+"  "+second;
    }
}
