public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converter(); // Converte o valor para Real
    public abstract String info(); // Retorna informações da moeda

    @Override
    public String toString() {
        return info() + " - " + valor;
    }
}
