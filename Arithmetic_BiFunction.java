/*
用委派實作四則運算：BiFunction
1. java Function 與 C# Func 功能相同，實際用法有差異
2. java Function可接受1個參數, BiFunction可接受2個參數
*/

import java.util.*;
import java.util.function.*;

class Arithmetic_BiFunction {
    private static String Calculate(BiFunction<Number, Number, String> method, Number num1, Number num2) {
        return method.apply(num1, num2);
    }
        
    public static void main(String[] args) {
        BiFunction<Number, Number, String> Add = (Number num1, Number num2) -> String.format("%s + %s = %.2f", num1, num2, ( num1.doubleValue() + num2.doubleValue() ));
        BiFunction<Number, Number, String> Sub = (Number num1, Number num2) -> String.format("%s - %s = %.2f", num1, num2, ( num1.doubleValue() - num2.doubleValue() ));
        BiFunction<Number, Number, String> Divide = (Number num1, Number num2) -> String.format("%s ÷ %s = %.2f", num1, num2, ( num1.doubleValue() / num2.doubleValue() ));
        BiFunction<Number, Number, String> Multiply = (Number num1, Number num2) -> String.format("%s * %s = %.2f", num1, num2, ( num1.doubleValue() * num2.doubleValue() ));
        
        System.out.println(Calculate(Add, 6.0, 5.0));
        System.out.println(Calculate(Sub, 6.0, 5.0));
        System.out.println(Calculate(Divide, 6.0, 5.0));
        System.out.println(Calculate(Multiply, 6.0, 5.0));
    }
}