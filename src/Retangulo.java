class Retangulo implements AreaCalculavel {
    private double largura;
    private double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea() {
        return largura * altura;
    }
}