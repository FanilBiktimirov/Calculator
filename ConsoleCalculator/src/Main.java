import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите данные для операции через пробел");
        try (Scanner sc = new Scanner(System.in)) {
            String result = new Calc().calculate(sc.nextLine().trim().split(" "));
            System.out.println("Ответ: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка! Калькулятор принимает числа от 1 до 10 включительно.");
        }

    }

}