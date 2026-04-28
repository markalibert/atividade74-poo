class SeguroDeVida implements Tributavel {
    private double valor;

    SeguroDeVida(double valor) {
        this.valor = valor;
    }

    public double calculaTributos(double taxa) {
        return valor * taxa + 10;
    }
}