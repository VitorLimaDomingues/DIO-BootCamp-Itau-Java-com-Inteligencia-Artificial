import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
//        1. Primeira demonstração
//        System.out.print("Informe o seu nome: ");
//        var name = scanner.next();
//        System.out.print("Informe sua idade: ");
//        var age = scanner.nextInt();
//        System.out.print("Você é emancipado (s/n): ");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s"); // equalsIgnoredCase ignora se o usuário digitou o valor em Maíusculo.
//
//        if (age >= 18) {
//            System.out.printf("%s. Você tem %s anos e pode dirigir \n", name, age);
//        } else if (age >= 16 && isEmancipated) {
//            System.out.printf("%s. Apesar de você ter %s anos, você é emancipado e pode dirigir. \n", name, age);
//        } else {
//            System.out.printf("%s. Você não pode dirigir. \n", name);
//        }
//
//        System.out.println("Fim da execução");

//        2. Segunda demonstração
//        System.out.print("Informe o seu nome: ");
//        var name = scanner.next();
//        System.out.print("Informe sua idade: ");
//        var age = scanner.nextInt();
//        System.out.print("Você é emancipado (s/n): ");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s"); // equalsIgnoredCase ignora se o usuário digitou o valor em Maíusculo.
//
//        // uma possibilidade é também fazer var canDrive = (age >= 18) || (age >= 16 && isEmancipated); if (canDrive) {mensagem}
//        if ((age >= 18) || (age >= 16 && isEmancipated)) {
//            System.out.printf("%s. Você pode dirigir! \n", name);
//        } else {
//            System.out.printf("%s. Você não pode dirigir!", name);
//        }
//
//        System.out.println();
//        System.out.println("Fim da execução");

//        3. Terceira demonstração
//        System.out.print("Informe o seu nome: ");
//        var name = scanner.next();
//        System.out.print("Informe sua idade: ");
//        var age = scanner.nextInt();
//        System.out.print("Você é emancipado (s/n): ");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s"); // equalsIgnoredCase ignora se o usuário digitou o valor em Maíusculo.
//
//        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
//        var message = "";
//        if (canDrive) {
//            message = name + ". Você pode dirigir! \n";
//        } else {
//            message = name + ". Você não pode dirigir!";
//        }
//
//        System.out.println(message);
//        System.out.println("Fim da execução");

        System.out.print("Informe o seu nome: ");
        var name = scanner.next();
        System.out.print("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.print("Você é emancipado (s/n): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s"); // equalsIgnoredCase ignora se o usuário digitou o valor em Maíusculo.

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

        var message = canDrive ? name + ". Você pode dirigir \n" : name + ". Você não pode dirigir \n"; // Elvis Operator

        System.out.println(message);
        System.out.println("Fim da execução");
    }
}
