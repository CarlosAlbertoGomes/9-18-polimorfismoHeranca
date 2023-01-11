/* Implementando herança e sobrepondo métodos

Neste exercício de codificação, você deverá por em prática o que aprendeu nas aulas sobre
Herança e Polimorfismo.

Temos duas classes: "Figura" e "Retangulo".
Faça a classe "Retangulo" herdar da classe "Figura" e implementar o método "calculaArea"
na classe derivada (classe filha).

NOTAS:

O método "calculaArea" deverá devolver o produto dado por Largura X Altura.
NÃO ESQUEÇA de implementar o construtor da classe "Retangulo" (classe filha)
fazendo a chamada ao construtor da classe "Figura" (classe mãe).*/

package herancaPolimorfismo;

public class Figura {

    public double largura;
    public double altura;
    public double base;

    public Figura(double l, double a, double b) {

        this.largura = l;
        this.altura = a;
        this.base =  b;
    }

    public Figura() {
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double l) {
        largura = l;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    /*IMPLEMENTAR O MÉTODO "calculaArea" DENTRO DA CLASSE RETÂNGULO.
    ESTE MÉTODO DEVERÁ DEVOLVER A ÁREA DO RETÂNGULO, OBTIDO ATRAVÉS
    DA MÚLTIPLICAÇÃO DA "largura x altura" QUE SÃO ATRIBUTOS DE "FIGURA".*/

    public double calculaArea() {
        return 0;
    }
}