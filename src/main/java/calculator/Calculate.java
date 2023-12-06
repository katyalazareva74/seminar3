package calculator;

//import static jdk.nashorn.internal.objects.NativeMath.round;

public class Calculate {
    public static <E extends Number, T extends Number> double sum(E num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <E extends Number, T extends Number> double subtract(E num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public static <E extends Number, T extends Number> double multiplay(E num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    public static <E extends Number, T extends Number> double divide(E num1, T num2){
         return num1.doubleValue() / num2.doubleValue();
    }

}
