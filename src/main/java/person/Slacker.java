package person;

public class Slacker implements Person{
    @Override
    public void doWork() {
        System.out.println("No work!");
    }

    @Override
    public void haveRest() {
        System.out.println("Chill!");
    }
}
