import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        // Создаем список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Используем Stream API для фильтрации четных чисел и расчета среднего
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)  // Оставляем только четные числа
                .mapToInt(Integer::intValue)  // Преобразуем в поток целых чисел
                .average();  // Вычисляем среднее значение

        // Выводим результат
        if (average.isPresent()) {
            System.out.println("Среднее значение четных чисел: " + average.getAsDouble());
        } else {
            System.out.println("Четные числа отсутствуют.");
        }
    }
}