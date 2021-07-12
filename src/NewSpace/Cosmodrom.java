package NewSpace;

public class Cosmodrom {
    public void starting(IStart object) {
        if (!object.checking()) {
            return;
        }
        object.engineStart();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        object.start();
    }
}








