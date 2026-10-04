import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // operador de igual = é lido como atribuição

        /* 1. primeira demonstração
        System.out.println("Quanto é 2 + 2?"); // pergunta ao usuário quanto é 2 + 2
        var result = scanner.nextInt(); // lê o dado inserido pelo usuário
        var isRight = result == 4; // "==" é lido como "igual", isso significa que está variável está pergutando se o valor iguala 4
        var isDifferent = result != 4; // "!=" é lido como "diferente de", isso significa que está variável está perguntando se o valor é diferente de 4
        System.out.printf("O resultado é 4, você acertou? (%s)", isDifferent); // printformat para mostrar ao usuário o resultado do seu dado
        */

        /* 2. segunda demonstração
        System.out.print("Quantos anos você tem: "); // pergunta ao usuário quantos anos ele possui
        var age = scanner.nextInt(); // lê o dado inserido pelo usuário
        System.out.print("Você é emancipado: "); // pergunta ao usuário se ele é emancipado
        var isEmancipated = scanner.nextBoolean(); // lê o dado inserido pelo usuário
        // var canDrive = age > 17; // ">" é lido como "maior", isso significa que está variável está perguntando se o valor é maior que 17
        // var canDrive = age >= 17; // ">=" é lido como "maior igual", isso significa que está variável está perguntando se o valor é maior ou igual a 18
        // var canNotDrive = age < 17; // "<" é lido como "menor", isso significa que está variável está perguntando se o valor é menor que 17
        // var canNotDrive = age <= 17; // "<=" é lido como "menor igual", isso significa que está variável está perguntando se o valor é menor ou igual a 17
        // var canNotDrive = age >= 18 || isEmancipated; // "||" é lido como "ou", isso significa que está variável está perguntando se o valor é 18 OU se ele é emancipado (true or false)
        var canNotDrive = age >= 18 || isEmancipated && age > 16; // "&&" é lido como "e", isso significa que está variável está perguntando se o valor é maior ou igual a 18, ou o usuário é emancipado. Se a primeira for false e a segunda true, ele pergunta logo em seguida se o usuário possuí idade maior que 16 (seguindo a legislação brasileira)
        System.out.printf("Você pode dirigir? (%s) \n", canNotDrive); // printformat para mostrar ao usuário o resultado
         */

        System.out.printf("true  && true = %s \n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true  && false = %s \n", true && false);
        System.out.printf("false && true = %s \n", false && true);
        System.out.println("================================");
        System.out.printf("true  || true = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true  || false = %s \n", true || false);
        System.out.printf("false || true = %s \n", false || true);
        System.out.println("=================================");
        System.out.printf("!true = %s \n", !true);
        System.out.printf("!false = %s \n", !false);

    }
}