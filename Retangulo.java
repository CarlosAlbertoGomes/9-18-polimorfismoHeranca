// FAÇA A CLASSE "RETÂNGULO" HERDAR DE "FIGURA"

package herancaPolimorfismo;

public class Retangulo extends Figura {

    public Retangulo(double l, double a, double b) {
        super(l, a, b);
    }
    public double calculaArea() {
        return largura * altura;
    }
}