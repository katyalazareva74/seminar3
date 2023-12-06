package calculator;

public class Main {
    /**
     * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
     * sum(), multiply(), divide(), subtract(). Параметры этих методов – два
     * числа разного типа, над которыми должна быть произведена операция.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Calculate.sum(5, 9));
        System.out.println(Calculate.subtract(5, 9));
        System.out.println(Calculate.multiplay(5, 9));
        System.out.printf("%.2f", Calculate.divide(5, 9));
    }
}
