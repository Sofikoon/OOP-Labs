import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NumberOperations {

    public static void main(String[] args) {
        // Створюємо список для зберігання чисел
        List<Number> numbers = new ArrayList<>();
        
        numbers.add(10);        // int
        numbers.add(20.5);      // double
        numbers.add(30);        // int
        numbers.add(40.7);      // double
        numbers.add(50);        // int
        numbers.add(60.3);      // double
        numbers.add(70);        // int
        numbers.add(80.1);      // double
        numbers.add(90);        // int
        numbers.add(100.9);     // double

        // Виведемо всі числа у списку
        StringBuilder allNumbers = new StringBuilder("Всі числа у списку: ");
        for (Number num : numbers) {
            allNumbers.append(num).append("; ");
        }
        System.out.print(allNumbers);

        // Виведемо числа у форматі цілих чисел
        StringBuilder intNumbers = new StringBuilder("\nЧисла у форматі цілих: ");
        for (Number num : numbers) {
            intNumbers.append(num.intValue()).append("; ");
        }
        System.out.print(intNumbers);

        // Виведемо числа у форматі дробних з двома знаками після коми
        StringBuilder doubleNumbers = new StringBuilder("\nЧисла у форматі дробних з 2-ма знаками після коми: ");
        for (Number num : numbers) {
            doubleNumbers.append(String.format("%.2f", num.doubleValue())).append("; ");
        }
        System.out.print(doubleNumbers);

        // Створимо два списки для зберігання чисел відповідних типів
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        for (Number num : numbers) {
            if (num instanceof Integer) {
                integers.add((Integer) num);
            } else if (num instanceof Double) {
                doubles.add((Double) num);
            }
        }

        // Виведемо цілі числа
        StringBuilder intList = new StringBuilder("\nЦілі числа: ");
        for (Integer integer : integers) {
            intList.append(integer).append("; ");
        }
        System.out.print(intList);

        // Виведемо дробові числа
        StringBuilder doubleList = new StringBuilder("\nДробові числа: ");
        for (Double doubleNum : doubles) {
            doubleList.append(doubleNum).append("; ");
        }
        System.out.print(doubleList);

        // Обчислимо добуток перших п'яти чисел у списку за допомогою BigDecimal
        BigDecimal product = BigDecimal.ONE;
        for (int i = 0; i < 5; i++) {
            product = product.multiply(BigDecimal.valueOf(numbers.get(i).doubleValue()));
        }

        System.out.printf("\nДобуток перших 5-и чисел: %.3f%n ", product);
    }
}