package exercicios.da.aula;

import java.util.Scanner;
import java.util.Random;

public class CalculadoraErrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.next();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
         case "+":
        resultado = num1 + num2;
        break;
        case "-":
        resultado = num1 - num2;
        break;
        case "*":
        resultado = num1 * num2;
        break;
        case "/":
        if (num2 != 0) {
        resultado = num1 / num2;
        } else {
        System.out.println("Erro: divisão por zero.");
        operacaoValida = false;
        }
        break;
        default:
        System.out.println("Operador inválido.");
        operacaoValida = false;
        }

        if (operacaoValida) {
        
        double erroPercentual = (rand.nextDouble() * 2 - 1) / 100.0;
        double resultadoComErro = resultado + (resultado * erroPercentual);

        System.out.printf("Resultado com erro de %.2f%%: %.2f\n", erroPercentual * 100, resultadoComErro);
        }

        sc.close();
    }
}