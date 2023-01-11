package herancaPolimorfismo;

public class TesteCalculaArea {

    public static void main (String[] args) {
        Figura calculo = new Retangulo(2, 9, 0);
        Figura calculo2 = new Triangulo(0, 3, 4);

        System.out.println("O resultado do cálculo do retângulo é: " + calculo.calculaArea());
        System.out.println("O resultado do cálculo do triângulo: " + calculo2.calculaArea());
    }
}
