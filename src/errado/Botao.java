package errado;

public class Botao {
    private Lampada lampada;

    public Botao() {
        this.lampada =  new Lampada();
    }

    public void acender() {
        this.lampada.acender();
    }

    public void apagar() {
        this.lampada.apagar();
    }
}
