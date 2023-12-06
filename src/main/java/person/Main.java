package person;

public class Main {
    /**
     * Описать интерфейс Person с методами doWork() и haveRest(). Написать два класса работник и бездельник, реализующих интерфейс.
     * Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать, но умеет отдыхать.
     * Написать обобщённые классы Workplace и Club, содержащие массив из Person. В классах необходимо
     * вызывать у всего массива людей вызывать соответствующие методы.
     * @param args
     */
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Worker w3 = new Worker();
        Slacker sl1 = new Slacker();
        Slacker sl2 = new Slacker();
        Slacker sl3 = new Slacker();
        Person[] workers = {w3, w1, sl2};
        Person[] slackers = {w2, sl1, sl3};
        Workplace wpl = new Workplace<>(workers);
        Club club = new Club<>(slackers);
        wpl.work();
        club.heverest();
    }
}
