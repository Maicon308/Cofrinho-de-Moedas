public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 6.42; // Conversão para Real : Atualizado nos dias atuia - pela fonte do Google.
    }

    @Override
    public String info() {
        return "Euro";
    }
}
