package NewSpace;

import java.util.Random;

public class Shutl implements IStart {
    @Override
    public boolean checking() {
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println(a);
        if (a > 3) {
            System.out.println("Проверка прошла успешно");
            return true;
        } else System.out.println("Проверка провалена");
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");
    }
}
