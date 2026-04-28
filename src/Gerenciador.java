class GerenciadorDeImpostoDeRenda {
    private double taxa;
    private double total;

    GerenciadorDeImpostoDeRenda(double taxa) {
        this.taxa = taxa;
    }

    void adiciona(Tributavel t) {
        double valor = t.calculaTributos(taxa);
        total += valor;
        System.out.println("Total atual: " + total);
    }
}