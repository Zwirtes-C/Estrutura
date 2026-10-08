package correto;

import java.io.IO;

public class Botao {
    private ILampada lampada;

    public Botao(ILampada lampada) {
        this.lampada = lampada;
    }

    public void acender() {
        this.lampada.acender();
    }

    public void apagar() {
        this.lampada.apagar();
    }
}
