package herancaPolimorfismo;

public class Triangulo extends Figura {

    public Triangulo(double l, double a, double b) {
        super(l, a, b);
    }
    public double calculaArea() {
        return (base * altura) / 2;
    }
}
