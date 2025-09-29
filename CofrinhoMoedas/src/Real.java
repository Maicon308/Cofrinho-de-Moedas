public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor; // Já está em Real
    }

    @Override
    public String info() {
        return "Real";
    }
}
