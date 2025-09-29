public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 6.8; // Conversão para Real: Atualizado nos dias atuia - pela fonte do Google.
    }

    @Override
    public String info() {
        return "Dólar";
    }
}
