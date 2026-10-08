package correto;

public class Lampada  implements ILampada {
    @Override
    public void acender() {
        System.out.println("Lampada acessa.");
    }

    @Override
    public void apagar() {
        System.out.println("Lampada apagada.");
    }
}
