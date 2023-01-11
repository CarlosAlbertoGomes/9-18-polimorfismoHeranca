package herancaPolimorfismo;

public class TesteCalculaArea {
    public static void main (String[] args) {
        Figura calculo = new Retangulo(2, 9);
        Figura calculo2 = new Triangulo(6, 3);

        System.out.println("O resultado do cálculo do retângulo é: " + calculo.calculaArea());
        System.out.println("O resultado do cálculo do triângulo é: " + calculo2.calculaArea());
    }
}
