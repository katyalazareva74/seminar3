package comparearray;

public class Main {
    /**
     * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
     * если они одинаковые, и false в противном случае.
     * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
     * @param args
     */
    public static void main(String[] args) {
        Double[] ar1={1.00, 2.00, 3.00};
        Double[] ar2 = {1.00, 2.00, 3.00};
        Float[] ar3={1.0f, 4.0f, 2.0f};
        Float[] ar4 = {1.0f, 2.0f, 3.0f};
        Integer[] ar5={1, 2, 2, 3, 5, 3};
        Integer[] ar6 = {2, 2, 1, 5, 3, 3};
        System.out.println(CompareArray.compareArr(ar1, ar2));
        System.out.println(CompareArray.compareArr(ar3, ar4));
        System.out.println(CompareArray.compareArr(ar5, ar6));
    }
}
