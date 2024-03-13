
public class B1{
    public static void main(String args[]){
        System.out.println("Impressão de Resultado de Cálculos:\n");
        int a=3, b=2;
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        float div = a / b;

        System.out.println("O resultado da soma de A e B e: " + sum + "\n");
        System.out.println("O resultado da subtracao de A e B e: " + sub + "\n");
        System.out.println("O resultado da multiplicacao de A e B e: " + mult + "\n");
        System.out.println("O resultado da divisao de A e B e: " + div + "(resultado estranho por conta da divisao 2 por 3)\n");

    }
}