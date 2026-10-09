import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // 1. Primeira demonstração
        // System.out.print("Informe o primeiro número: ");
        // var value = scanner.nextInt(); caso trabalhe com decimais, é recomendado que altere para nextFloat
        // System.out.print("Informe o segundo número: ");
        // var value2 = scanner.nextInt(); caso trabalhe com decimais, é recomendado que altere para nextFloat
        // System.out.println(value + "" + value2 + "=" + (value + value2)); Exemplo com concatenação
        // System.out.printf("%s + %s = %s\n", value, value2, value + value2); Exemplo com operação de adição
        // System.out.printf("%s - %s = %s\n", value, value2, value - value2); Exemplo com operação de subtração
        // System.out.printf("%s / %s = %s\n", value, value2, value / value2); Exemplo com operação de divisão
        // System.out.printf("%s * %s = %s\n", value, value2, value * value2); Exemplo com operação de multiplicação
        // System.out.printf("%s %% %s = %s\n", value, value2, value % value2); Exemplo com operação de porcentagem

        // 2. Segunda demonstração
//        var value = 5;
//        // value = value + 12; funciona
//        value += 12; // forma mais resumida de fazer a operação acima.
//        System.out.println(value);

        // 3. Terceira demonstração
//        System.out.print("Informe o primeiro número: ");
//        var value1 = scanner.nextInt();
//        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1)); Exemplo de raíz quadrada
//        System.out.printf("A potência de %s é %s\n", value1, Math.pow(value1, 2)); Exemplo de potência (ao quadrado)
//        System.out.printf("A potência de %s é %s\n", value1, Math.pow(value1, 2)); Exemplo de potência (ao cubo)

        // 4. Quarta demonstração
        var value = 50;
        System.out.println(++value); // Operador de incremento
        System.out.println(--value); // Operador de decremento
    //    System.out.println(value++); // Operador de incremento, porém na direita. Isso significa que ele faz a atribuição, mas só executa na próxima linha
    //    System.out.println(value--); // Operador de decremento, porém na direita. Isso significa que ele faz a decremental, mas só executa na próxima linha
        System.out.println(value);
    }
}