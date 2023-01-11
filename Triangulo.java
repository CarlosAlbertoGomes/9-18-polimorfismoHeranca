// criei essa classe como um "extra" do exercício

package herancaPolimorfismo;
public class Triangulo extends Figura {
    public double base;
    public Triangulo(double b, double a) {
        super(a);
        this.base = b;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double calculaArea() {
        return (base * altura) / 2;
    }
}
