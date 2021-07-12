package NewSpace;

import java.util.Random;
import java.util.Scanner;

public class Sputnik implements IStart {
    @Override
    public boolean checking() {
        System.out.println("Введите дату рождения для запуска");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2000) {
            System.out.println("Проверка пройдена.Ваш спутник готов к запуску.");
            return true;
        } else System.out.println("Вы еще слишком молоды для запуска спутника");
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("До запуска спутника остается");
    }

    @Override
    public void start() {
        System.out.println("Старт");
    }
}
