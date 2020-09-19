import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Внимание! Калькулятор принимает числа от 1 до 10 включительно.");
        System.out.println ("Калькулятор умеет работать только с целыми числами, только с арабскими или римскими цифрами одновременно");
        System.out.println("При вводе неподходящих чисел приложение завершает свою работу.");
        System.out.println("Введите данные через пробел:");
        try (Scanner sc = new Scanner(System.in)) {
            String result = new Calc().calculate(sc.nextLine().trim().split(" "));
            System.out.println("Ответ: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка! Данные введены некорректно!");
        }

    }

}
