package NewSpace;

public class Rocket implements IStart {


    @Override
    public boolean checking() {
        System.out.println("Проверка прошла успешно");
        return true;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатель запущен");
    }

    @Override
    public void start() {
        System.out.println("Стартуем");
    }
}
