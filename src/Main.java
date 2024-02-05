import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter("Качество здоровья с рекомендациями и калориями.txt");

        out.println("Добро пожаловать в программу по расчёту \"качества здоровья с рекомендациями и калориями\"!\n");
        System.out.println("Добро пожаловать в программу по расчёту \"качества здоровья с рекомендациями и калориями\"!\n");

        out.println("Для расчёта ИМТ (Индекса Массы Тела) нам необходимо запросить ваши параметры роста в квадрате и веса: \n");
        System.out.println("Для расчёта ИМТ (Индекса Массы Тела) нам необходимо запросить ваши параметры: \n");

        System.out.println("Введите свой рост (в сантиметрах): ");
        int height = in.nextInt();

        System.out.println("Введите свой вес: ");
        int weight = in.nextInt();

        System.out.println("Введите свой возраст: ");
        byte age = in.nextByte();

        double DCI = (weight * 10) + (height * 6.25) - (age * 5 + 5);

        System.out.println("Введённые пользователем параметры тела: \n" +
                "1. Рост: " + height + " сантиметров\n" +
                "2. Вес: " + weight + " килограмм\n" +
                "3. Возраст: " + age + " лет\n\n");

        out.println("Введённые пользователем параметры тела: \n" +
                "1. Рост: " + height + " сантиметров\n" +
                "2. Вес: " + weight + " килограмм\n" +
                "3. Возраст: " + age + " лет\n");

        int IMT = weight/(height * height);

        System.out.println("Ваш индекс массы тела имеет значение: " + IMT + ".\n\n");

        out.println("Ваш индекс массы тела имеет значение: " + IMT + ".\n\n");

        double perfect_weight = height - 100;

        if (IMT > 24.9)
        {
            System.out.println("Рекомендуется снизить вес для достижения идеального веса. \nИдеальный вес: " + perfect_weight + "\nНеобходимо сбросить: " + (weight - perfect_weight) + " кг. \nРекомендуемый дневной прием калорий: " + DCI + ".\n");
            out.println("Рекомендуется снизить вес для достижения идеального веса. \nИдеальный вес: " + perfect_weight + "\nНеобходимо сбросить: " + (weight - perfect_weight) + " кг. \nРекомендуемый дневной прием калорий: " + DCI + ".\n");
        }
        else if (IMT < 18.5)
        {
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса. \nИдеальный вес: " + perfect_weight + "\nНеобходимо набрать: " + (perfect_weight - weight) + " кг. \nРекомендуемый дневной прием калорий: " + DCI + ".\n");
            out.println("Рекомендуется увеличить потребление пищи для набора веса. \nИдеальный вес: " + perfect_weight + "\nНеобходимо набрать: " + (perfect_weight - weight) + " кг. \nРекомендуемый дневной прием калорий: " + DCI + ".\n");
        }
        else
        {
            System.out.println("Ваш вес находится в пределах нормы. \nИдеальный вес: " + perfect_weight + ". \nРекомендуемый дневной прием калорий: " + DCI + ".\n\n");
            out.println("Ваш вес находится в пределах нормы. \nИдеальный вес: " + perfect_weight + ". \nРекомендуемый дневной прием калорий: " + DCI + ".\n\n");
        }

        double HB = 655.1 + (9.6 * weight) + (1.85 * height) - (age * 4.68);
        System.out.println("Дневная норма калорий: " + HB + ".");
        out.println("Дневная норма калорий: " + HB + ".");

        out.close();
    }

}