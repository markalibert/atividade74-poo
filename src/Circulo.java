class Circulo implements AreaCalculavel {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return 3.14 * raio * raio;
    }
}