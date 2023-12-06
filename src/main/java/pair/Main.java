package pair;

public class Main {
    /**
     * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
     * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
     * а также переопределение метода toString(), возвращающее строковое представление пары.
     * @param args
     */
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Hello ", 2024);
        System.out.println(p1.getFirst());
        Pair<Double, Integer> p12= new Pair<>(12.00, 2024);
        System.out.println(p1.getSecond());
        Pair<String, String> p13= new Pair<>("Happy", "2024");
        System.out.println(p1.toString());
        System.out.println(p12.toString());
        System.out.println(p13.toString());
    }
}
