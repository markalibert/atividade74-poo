class ContaCorrente implements Tributavel {
    private double saldo;

    ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double calculaTributos(double taxa) {
        return saldo * taxa * 0.1;
    }
}