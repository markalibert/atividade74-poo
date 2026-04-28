public class Main {
    public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda ger = new GerenciadorDeImpostoDeRenda(0.2);

        ContaCorrente cc = new ContaCorrente(151000);
        SeguroDeVida sv = new SeguroDeVida(500);

        ger.adiciona(cc);
        ger.adiciona(sv);

        //teste com demetrio
        // teste de novo
    }
}