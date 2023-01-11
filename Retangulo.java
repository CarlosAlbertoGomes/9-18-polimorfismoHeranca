// FAÇA A CLASSE "RETÂNGULO" HERDAR DE "FIGURA"

package herancaPolimorfismo;
public class Retangulo extends Figura {
    public double largura;
    public Retangulo(double l, double a) {
        super(a);
        this.largura = l;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double calculaArea() {
        return largura * altura;
    }
}