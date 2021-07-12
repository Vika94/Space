package NewSpace;

public class Main {
    public static void main(String[] args) {
        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.starting(new Rocket());
        cosmodrom.starting(new Shutl());
        cosmodrom.starting(new Sputnik());

    }
}
