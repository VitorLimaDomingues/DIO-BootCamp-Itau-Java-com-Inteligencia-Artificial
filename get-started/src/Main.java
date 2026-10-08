import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        var value = scanner.nextInt(); // caso trabalhe com decimais, é recomendado que altere para nextFloat
        System.out.print("Informe o segundo número: ");
        var value2 = scanner.nextInt(); // caso trabalhe com decimais, é recomendado que altere para nextFloat
       // System.out.println(value + "" + value2 + "=" + (value + value2)); Exemplo com concatenação
       // System.out.printf("%s + %s = %s\n", value, value2, value + value2); Exemplo com operação de adição
       // System.out.printf("%s - %s = %s\n", value, value2, value - value2); Exemplo com operação de subtração
       // System.out.printf("%s / %s = %s\n", value, value2, value / value2); Exemplo com operação de divisão
       // System.out.printf("%s * %s = %s\n", value, value2, value * value2); Exemplo com operação de multiplicação
    }
}