package semin;

import java.io.DataInputStream;

public class Main {
    /**
     * Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), конструктор,
     * принимающий на вход параметры типа (T, V, K),
     * методы  возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
     * классов для трех переменных класса. Наложить ограничения на параметры типа:
     * T должен реализовать интерфейс Comparable (классы оболочки, String), V должен реализовать интерфейс DataInput
     * и расширять класс InputStream, K должен расширять класс Number.
     * @param args
     */
    public static void main(String[] args) {
        String t1 = "Hello";
        DataInputStream v1 = new DataInputStream(System.in);
        Number k1 = 5;
        MegaClass<String, DataInputStream, Number> megaObject = new MegaClass<>(t1, v1, k1);
        megaObject.className(t1, v1, k1);
    }
 }

