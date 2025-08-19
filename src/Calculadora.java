import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Simples c/ Java");
        System.out.println();

        System.out.print("Digite o 1° némero: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.next();
        System.out.print("Digite o 2° némero: ");
        double num2 = sc.nextDouble();

        switch (operador) {
            case "+":
                double soma = num1 + num2;
                System.out.println(soma);
                break;
            case "-":
                double sub = num1 - num2;
                System.out.println(sub);
                break;
            case "*":
                double mult = num1 * num2;
                System.out.println(mult);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    double div = num1 / num2;
                    System.out.println(div);
                    break;
                }
        }
    } }
