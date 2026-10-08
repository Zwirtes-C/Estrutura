package correto;

public class Main {
    public static void main(String[] args) {
        ILampada lampada = new Lampada();
        Botao botao = new Botao(lampada);
        botao.acender();
        botao.apagar();
    }
}
